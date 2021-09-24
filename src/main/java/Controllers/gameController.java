package Controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class gameController {

	@GetMapping({"/game"})
	public String entrance(Model model) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(14);
		list.add(15);
		
		
		model.addAttribute("number", list);
		
		return "testGame";
	}
}
