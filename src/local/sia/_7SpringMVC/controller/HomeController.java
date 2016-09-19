package local.sia._7SpringMVC.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import local.sia._7SpringMVC.service.SpitterService;
import local.sia.util.ClassContainStatic;

@Controller
public class HomeController {

	private SpitterService spitterService;
	
	@Inject
	public HomeController(SpitterService spitterService){
		this.spitterService = spitterService;
	}
	
	@RequestMapping({"/","/home"})
	public String  showHomepage(Map<String, Object> model) {
		model.put("spittles", spitterService.getRecentSpittles(ClassContainStatic.DEFAULT_SPITTLES_PER_PAGE));
		return "home";
	}
}
