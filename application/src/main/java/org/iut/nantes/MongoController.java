package org.iut.nantes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.internet.InternetAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import iut.org.nantes.User.User;
import iut.org.nantes.factories.Monument;

@CrossOrigin
@Component
@RestController
@RequestMapping("/user")
public class MongoController {

	// We auto-connect the mongodb operations
	@Autowired
	MongoOperations mongoOp;

	// In the URL :
	// http://localhost:8080/user/register?username=<VALUE>&password=<VALUE>&nom=<VALUE>&prenom=<VALUE>&email=<VALUE>
	// We receive the user data in the register view
	@RequestMapping(method = RequestMethod.GET, value = "/register")
	@ResponseBody
	public Map<String, Object> createUser(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password, @RequestParam(name = "nom") String nom,
			@RequestParam(name = "prenom") String prenom, @RequestParam(name = "email") String email) {
		// We create an user entity and we add the values to the entity
		User user = new User(username.trim(), password.trim(), nom.trim(), prenom.trim(), email.trim());
		Map<String, Object> response = new HashMap<String, Object>();
		// It validates if the user email is right, if all the
		if (notEmpty(user)) {
			if (mailFormat(user)) {
				if (notExists(user)) {
					if (usernameCorrect(user)) {
						mongoOp.insert(user, "users");
						response.put("status", "ok");
						response.put("msg", "Vous pouvez se connecter maintenant " + user.getUsername());
						return response;
					} else {
						response.put("status", "error");
						response.put("msg", "Le nom d'utilisateur ne doit pas avoir d'espaces");
						return response;
					}
				} else {
					response.put("status", "error");
					response.put("msg", "Le utilisateur est déjà inscrit");
					return response;
				}
			} else {
				response.put("status", "error");
				response.put("msg", "L'e-mail n'est pas valide");
				return response;
			}
		} else {
			response.put("status", "error");
			response.put("msg", "Ramplissez tous le champs");
			return response;
		}
	}

	// This method checks username don't have whitespaces
	private boolean usernameCorrect(User user) {
		return !StringUtils.containsWhitespace(user.getUsername());
	}

	// This method allows to know if the user exists in the database
	private boolean notExists(User user) {
		// We create a query whit the criteria where the user name and the email have
		// been registered in the database
		Query query = new Query(Criteria.where("username").is(user.getUsername()).and("email").is(user.getEmail()));
		// We find him
		User userDB = null;
		try {
			userDB = mongoOp.findOne(query, User.class);
		} catch (Exception e) {
			userDB = null;
		}
		// If the result is null that means the user has not been registered before
		if (userDB == null) {
			return true;
		} else {
			return false;
		}
	}

	// This method allows to know if the fields are filled correctly
	private boolean notEmpty(User user) {
		return user.getUsername().equals("undefined") || user.getPassword().equals("undefined")
				|| user.getNom().equals("undefined") || user.getPrenom().equals("undefined")
				|| user.getEmail().equals("undefined") ? false : true;
	}

	// We use the InternetAdrres class to know if the user mail have a correct
	// format
	private boolean mailFormat(User user) {
		try {
			InternetAddress email = new InternetAddress(user.getEmail());
			email.validate();
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	// In the URL : http://localhost:8080/users/ -> We get all users data (Only for
	// test)
	@RequestMapping(method = RequestMethod.GET, value = "/users/")
	@ResponseBody
	public List<User> findAllUsers() {
		return mongoOp.findAll(User.class, "users");
	}

	// In the URL : http://localhost:8080/login?username=<VALUE>&password=<VALUE> ->
	// To login in the application
	@RequestMapping(method = RequestMethod.GET, value = "/login")
	@ResponseBody
	public Map<String, Object> findUser(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password) {
		// We create a query, the criteria is where the username and password in the DB
		// are the same from the application login page
		Query query = new Query(Criteria.where("username").is(username).and("password").is(password));
		// We try to find him
		User userBd = null;
		try {
			userBd = mongoOp.findOne(query, User.class, "users");
		} catch (Exception e) {
			userBd = null;
		}

		Map<String, Object> response = new HashMap<String, Object>();
		// If the result is not null that means the user was created before
		if (emptyValues(username, password)) {
			if (userBd != null) {
				// Then, user DB data is the same from the application login page
				if (userBd.getUsername().equals(username) && userBd.getPassword().equals(password)) {
					response.put("status", "ok");
					response.put("msg", "Bienvenue " + userBd.getUsername());
					response.put("username", userBd.getUsername());
					return response;
				} else {
					response.put("status", "error");
					response.put("msg", "Le nom d'utilisateur ou mot de pass sont incorrects" + userBd.getUsername());
					return response;
				}
			} else {
				response.put("status", "error");
				response.put("msg", "Le nom d'utilisateur ou mot de pass sont incorrects");
				return response;
			}
		} else {
			response.put("status", "error");
			response.put("msg", "Ramplissez tous le champs");
			return response;
		}
	}

	private boolean emptyValues(String username, String password) {
		return username.equals("undefined") || password.equals("undefined") ? false : true;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/save", consumes = "application/json")
	public Map<String, Object> saveMonumentList(@RequestBody Monument[] monuments) {

		Map<String, Object> response = new HashMap<String, Object>();
		response.put("status", "ok");
		response.put("msg", "Vous avez de monuments à visiter");

		for (Monument monument : monuments) {
			if (notRepeated(monument)) {
				mongoOp.insert(monument, "monuments");
			}
		}
		return response;
	}

	private boolean notRepeated(Monument monument) {
		return mongoOp.findOne(new Query(Criteria.where("codeinseecommune").is(monument.getCodeinseecommune())),
				Monument.class, "monuments") == null ? true : false;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/toVisit/")
	@ResponseBody
	public List<Monument> findAllMonuments() {
		List<Monument> visited = mongoOp.findAll(Monument.class, "monuments");
		List<Monument> tmp = new ArrayList<Monument>();
		for (Monument monument : visited) {
			if (!monument.isVisited()) {
				tmp.add(monument);
			}
		}
		return tmp;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/visitedMonuments/")
	@ResponseBody
	public List<Monument> findAllVisitedMonuments() {
		List<Monument> visited = mongoOp.findAll(Monument.class, "monuments");
		List<Monument> tmp = new ArrayList<Monument>();
		for (Monument monument : visited) {
			if (monument.isVisited()) {
				tmp.add(monument);
			}
		}
		return tmp;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/delete", consumes = "application/json")
	@ResponseBody
	public Map<String, Object> deleteMonument(@RequestBody Monument monument) {
		Map<String, Object> response = new HashMap<String, Object>();
		mongoOp.remove(new Query(Criteria.where("codeinseecommune").is(monument.getCodeinseecommune())), Monument.class,
				"monuments");
		response.put("status", "ok");
		response.put("msg", "Element supprimé");
		return response;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/updateMonument", consumes = "application/json")
	@ResponseBody
	public Map<String, Object> updateMonument(@RequestBody Monument monument) {
		Map<String, Object> response = new HashMap<String, Object>();
		Update update = new Update();
		update.set("visited", true);
		mongoOp.upsert(new Query(Criteria.where("codeinseecommune").is(monument.getCodeinseecommune())), update,
				Monument.class, "monuments");
		response.put("status", "ok");
		response.put("msg", "Bon !");
		return response;
	}
}
