package guru.springframework.controllers;

import guru.springframework.domain.Recipe;
import guru.springframework.services.RecipeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anySet;
import static org.mockito.Mockito.*;

public class IndexControllerTest {

    IndexController indexController;

    @Mock
    RecipeService recipeService;

    @Mock
    Model model;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }

    @Test
    public void getIndexPage_first() {

        Recipe recipe = new Recipe();
        HashSet recipesData = new HashSet();
        recipesData.add(recipe);
        when(recipeService.getRecipes()).thenReturn(recipesData);

        String index = indexController.getIndexPage(model);
        assertEquals("index",index);
        verify(recipeService,times(1)).getRecipes();
        verify(model,times(1)).addAttribute("recipes",recipesData);
    }

    @Test
    public void getIndexPage_second() {

        Recipe recipe = new Recipe();

        String index = indexController.getIndexPage(model);
        assertEquals("index",index);
        verify(recipeService,times(1)).getRecipes();
        verify(model,times(1)).addAttribute(eq("recipes"),anySet());

    }
}