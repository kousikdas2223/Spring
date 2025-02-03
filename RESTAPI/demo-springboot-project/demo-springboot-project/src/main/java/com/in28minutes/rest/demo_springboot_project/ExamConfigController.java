package com.in28minutes.rest.demo_springboot_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamConfigController {
	
	@Autowired
	ExamServiceConfiguration config;
	
	@RequestMapping("/examConfig")
	public ExamServiceConfiguration getExamDetails(){
		return config;
	}

}
