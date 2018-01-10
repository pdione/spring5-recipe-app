package guru.springframework.services;

import java.util.Set;

import guru.springframework.domain.Recipe;

/**
 * 
 * @author boumi
 *
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
