package local.sia._7SpringMVC.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.catalina.connector.Request;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import local.sia._7SpringMVC.dao.domain.Spitter;
import local.sia._7SpringMVC.dao.domain.Spittle;
import local.sia._7SpringMVC.service.SpitterService;
import local.sia._7SpringMVC.service.SpittleService;
import local.sia.util.ImageUploadException;

@Controller
@RequestMapping("/spitters")
public class SpitterController {
	
	@Inject
	private HttpServletRequest request;
	
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
	
	@RequestMapping(method = RequestMethod.GET, params = "new")
	public String createSpitterProfile(Model model) {
		model.addAttribute(new Spitter());
		return "spitters/edit";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String addSpitterFromForm(@Valid Spitter spitter, BindingResult bindingResult,@RequestParam(value="image", required=false) MultipartFile image) {
		if (bindingResult.hasErrors()) {
			return "spitters/edit";
		}
		spitterService.saveSpitter(spitter);
		
		try {
			if (!image.isEmpty()) {
				validateImage(image);
				saveImage(spitter.getId() + ".jpg", image); 
			}
		} catch (ImageUploadException e) {
			bindingResult.reject(e.getMessage());
			return "spitters/edit";
		}
		return "redirect:/spitters/" + spitter.getUsername();
	}
	
	private void validateImage(MultipartFile image) {
		if (!image.getContentType().equals("image/jpeg")) {
			throw new ImageUploadException("Only JPG images accepted");
		}
	}
	
	private void saveImage(String filename, MultipartFile image) throws ImageUploadException {
		String webRootPath = this.request.getSession().getServletContext().getRealPath("/");
		
		try {
			File file = new File(webRootPath + "/resources/" + filename);
			FileUtils.writeByteArrayToFile(file, image.getBytes());
		} catch (IOException e) {
			throw new ImageUploadException("Unable to save image", e);
		}
	}
	
	@RequestMapping(value = "/{username}", method = RequestMethod.GET)
	public String showSpitterProfile(@PathVariable String username, Model model) {
		model.addAttribute(spitterService.getSpitterByName(username));
		System.out.println(spitterService.getSpitterByName(username).getFullname());
		return "spitters/view";
	}
}
