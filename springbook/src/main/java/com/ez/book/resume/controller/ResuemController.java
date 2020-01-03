package com.ez.book.resume.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/resume")
public class ResuemController {
	private static final Logger logger
	=LoggerFactory.getLogger(ResuemController.class); 

	@Autowired
	//private BoardService boardService;
	
	@RequestMapping(value="/resume.do", method=RequestMethod.GET)
	public String write_get() {
		logger.info("글쓰기 화면");
		
		return "resume/resume";
	}
	

}
