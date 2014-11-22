package pl.pszczola.jba.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import pl.pszczola.jba.entity.Blog;
import pl.pszczola.jba.entity.Item;
import pl.pszczola.jba.entity.Role;

public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	List<Item> findByBlog(Blog blog, Pageable pageable);

}
