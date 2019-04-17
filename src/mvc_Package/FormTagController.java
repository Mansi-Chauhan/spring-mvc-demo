package mvc_Package;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormTagController {
	
	@RequestMapping("/showingForm")
	public String showingForm(){
		
		return "showing-form";
	}

}
