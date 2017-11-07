package guru.springframework.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Category;

/**
 * 
 * @author boumi
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
