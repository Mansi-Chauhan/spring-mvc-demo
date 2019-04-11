package mvc_Package;

//import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")   //mapping controller method to root and handles all types of requests(get,post)
	public String showController() {
		return "main-menu";
	}

}
