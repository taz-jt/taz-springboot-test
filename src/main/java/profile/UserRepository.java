package profile;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import profile.User;

public interface UserRepository extends CrudRepository<User, Integer> {}