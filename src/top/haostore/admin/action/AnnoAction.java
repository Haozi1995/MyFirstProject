package top.haostore.admin.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class AnnoAction {

	@RequestMapping(value="/login.action")
	public String login(Model model){
		model.addAttribute("msg","×¢½âÊµÏÖSpringMVC");
		return "index";
	}
}
