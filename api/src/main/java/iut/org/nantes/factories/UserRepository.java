package iut.org.nantes.factories;

import org.springframework.data.mongodb.repository.MongoRepository;

import iut.org.nantes.User.User;

public interface UserRepository extends MongoRepository<User, String> {
	
}
