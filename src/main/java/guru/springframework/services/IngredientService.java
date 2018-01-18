package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created by Boumi.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}