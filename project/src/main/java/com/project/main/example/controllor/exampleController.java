package com.project.main.example.controllor;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class exampleController {

	protected Logger logger = LogManager.getLogger(getClass());
	

	
	@RequestMapping(value="/example/test.do")
	public void example() {
		System.out.println("test");
		logger.debug(">>> exampleController.example");
		
		
		
	}
	
	
	
}
