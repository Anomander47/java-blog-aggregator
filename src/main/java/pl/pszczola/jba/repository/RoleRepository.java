package pl.pszczola.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.pszczola.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String name);

}
