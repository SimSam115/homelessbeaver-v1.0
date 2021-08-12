package Controllers;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import data.GameDetails;

@Controller
public class HomePage {
	
	@GetMapping({"/"})
	public String entrance(Model model) {
		System.out.println("loaded ");
		
		
		LinkedList<GameDetails> games = new LinkedList<GameDetails>();
		games.add(new GameDetails(1,"Sam","Game is good","assest/img/a1.png","assest/img/a1_2.png"));
		games.add(new GameDetails(2,"Sam","Game is good","assest/img/a2.png","assest/img/a2_2.png"));
		games.add(new GameDetails(2,"Sam","Game is good","assest/img/a2.png","assest/img/a2_2.png"));
		games.add(new GameDetails(2,"Sam","Game is good","assest/img/a2.png","assest/img/a2_2.png"));
		games.add(new GameDetails(2,"Sam","Game is good","assest/img/a2.png","assest/img/a2_2.png"));
		games.add(new GameDetails(2,"Sam","Game is good","assest/img/a2.png","assest/img/a2_2.png"));
		games.add(new GameDetails(2,"Sam","Game is good","assest/img/a2.png","assest/img/a2_2.png"));
		games.add(new GameDetails(2,"Sam","Game is good","assest/img/a2.png","assest/img/a2_2.png"));
		games.add(new GameDetails(2,"Sam","Game is good","assest/img/a2.png","assest/img/a2_2.png"));
		games.add(new GameDetails(2,"Sam","Game is good","assest/img/a2.png","assest/img/a2_2.png"));
		games.add(new GameDetails(2,"Sam","Game is good","assest/img/a2.png","assest/img/a2_2.png"));
		games.add(new GameDetails(2,"Sam","Game is good","assest/img/a2.png","assest/img/a2_2.png"));
		
		
		model.addAttribute("games", games);
		return "index";
	}
}
