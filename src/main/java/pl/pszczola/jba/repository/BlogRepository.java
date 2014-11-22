package pl.pszczola.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.pszczola.jba.entity.Blog;
import pl.pszczola.jba.entity.Role;
import pl.pszczola.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
	
	List<Blog> findByUser(User user);

}
