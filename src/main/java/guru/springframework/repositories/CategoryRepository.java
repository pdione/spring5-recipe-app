package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Category;

/**
 * 
 * @author boumi
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
