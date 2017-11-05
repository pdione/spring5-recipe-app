package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Index Controller.
 * 
 * @author boumi
 *
 */
@Controller
public class IndexController {

    @RequestMapping({ "", "/", "index" })
    public String getIndexPage() {
	System.out.println("Something to say...");
	return "index";
    }

}
