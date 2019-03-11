package iut.org.nantes.User;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import iut.org.nantes.factories.Monument;

@Document(collection = "user")
public class User {

	private String id;

	private String username;
	private String password;
	private String nom;
	private String prenom;
	private String email;
	private List<Monument> visitMonument;

	public User(String username, String password, String nom, String prenom, String email) {
		super();
		this.username = username;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	
	public User() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Monument> getVisitMonument() {
		return visitMonument;
	}

	public void setVisitMonument(List<Monument> visitMonument) {
		this.visitMonument = visitMonument;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + "]";
	}
}