package com.study.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "Hello Test";
	}
	
	@RequestMapping("/test1")
	public String test1() {
		return "test1";
	}
}
