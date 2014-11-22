package pl.pszczola.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.pszczola.jba.entity.Role;
import pl.pszczola.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
