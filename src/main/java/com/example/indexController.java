package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {
	// handler mapping해주는것
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView renderIndexPage() {
	
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("username","S_Hyoun");
		return mav;
	}
	
}
