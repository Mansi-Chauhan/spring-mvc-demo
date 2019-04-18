package mvc_Package;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	//creating a method to display form initially
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	
	@RequestMapping("/showForm2")
	public String showForm2(Model model) {
       MyClass obj=new MyClass();
		model.addAttribute("myClass",obj);
		return "showForm2";
	}
	
	//Creating a method to process from
    
	@RequestMapping("/processForm")
	public String processForm() {
		return "process-form";
	}
	
	//Creating a method to process form using model
	
	@RequestMapping("/processForm2")
	public String processForm2(HttpServletRequest request, Model model) {
		String theName=request.getParameter("studentname");
		theName="YOU "+theName.toUpperCase();
		model.addAttribute("message",theName);
		return "process-form";
	}
	
	@RequestMapping("/processForm3")
	public String processForm3(@RequestParam("studentname") String theName, Model model) {
		
		
		theName="YOU "+theName.toUpperCase();
		model.addAttribute("message2",theName);
		
		return "process-form";
	}
	
	@RequestMapping("/processForm4")
	public String processForm4(@ModelAttribute("myClass") MyClass obj) {
		System.out.println("firstname = "+ obj.getFirstName() + " lastname =" + obj.getLastName());
		System.out.println("kvksnvsanvn");
		return "process-form";
	}
	
}
