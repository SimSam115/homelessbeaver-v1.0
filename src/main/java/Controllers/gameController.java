package Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class gameController {

	@GetMapping({"/game"})
	public String entrance(Model model) {
		System.out.println("loaded");
		
		return "testGame";
	}
}
