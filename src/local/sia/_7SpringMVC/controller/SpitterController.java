package local.sia._7SpringMVC.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import local.sia._7SpringMVC.dao.domain.Spitter;
import local.sia._7SpringMVC.dao.domain.Spittle;
import local.sia._7SpringMVC.service.SpitterService;
import local.sia._7SpringMVC.service.SpittleService;

@Controller
@RequestMapping("/spitter")
public class SpitterController {
	
	@Inject
	private SpitterService spitterService;
	
	@Inject
	private SpittleService spittleService;
	
	
	@RequestMapping(value = "/spittles")
	public String listSpittlesForSpitter(@RequestParam("spitter") String username, Model model) {
		Spitter spitter = spitterService.getSpitterByName(username);
		model.addAttribute(spitter);
//System.out.println(spitter.getUsername());
		List<Spittle> spittleList = spittleService.getSpittlesBySpitter(spitter);
		model.addAttribute(spittleService.getSpittlesBySpitter(spitter));
/*System.out.println(spittleList.size());
for(Spittle spittle:spittleList){
	System.out.println(spittle.getSpittleText());
}*/
		return "spittles/list";
	}
	
	
}
