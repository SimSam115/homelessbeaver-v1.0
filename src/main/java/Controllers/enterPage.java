package Controllers;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import data.GameDetails;

@Controller
public class enterPage {

	@GetMapping({"/"})
	public String entrance(Model model) {
		System.out.println("loaded ");
		
		
		LinkedList<GameDetails> games = new LinkedList<GameDetails>();
		games.add(new GameDetails(1,"Fish Store Frenzy","Game is good","assets/img/Games/HTML5/fishStore.png","Games/scratch/fishGame.html"));
		games.add(new GameDetails(2,"Gallagamma","Game is good","assets/img/Games/HTML5/bossBeatenUp.png","Games/scratch/gallagamma.html"));
		games.add(new GameDetails(3,"LetterFinder","Game is good","assets/img/Games/HTML5/letterfinder/letterFinder1.png","Games/scratch/letterFinder.html"));
		games.add(new GameDetails(4,"Racing Game","Game is good","assets/img/Games/HTML5/Audi.png","Games/scratch/racingGame.html"));
		games.add(new GameDetails(5,"testGame","Game is good","assets/img/Games/HTML5/tankGame.png","game"));
		
		
		model.addAttribute("games", games);
		return "index";
	}
}
