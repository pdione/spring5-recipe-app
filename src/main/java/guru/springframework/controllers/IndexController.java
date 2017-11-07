package guru.springframework.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.domain.Category;
import guru.springframework.domain.UnitOfMeasure;
import guru.springframework.repositories.CategoryRepository;
import guru.springframework.repositories.UnitOfMeasureRepository;

/**
 * Index Controller.
 * 
 * @author boumi
 *
 */
@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
	super();
	this.categoryRepository = categoryRepository;
	this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({ "", "/", "index" })
    public String getIndexPage() {

	Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
	Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

	System.out.println("Cat ID is:" + categoryOptional.get().getId());
	System.out.println("UOM ID is:" + unitOfMeasureOptional.get().getId());

	return "index";
    }

}
