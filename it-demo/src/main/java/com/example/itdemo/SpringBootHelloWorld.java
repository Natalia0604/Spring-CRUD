package com.example.itdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/qq")
//@RequestMapping(value = "/qq", method = RequestMethod.GET)
public class SpringBootHelloWorld {

	@GetMapping("/x")
	public String hello(){
		return "Hey, Spring Boot 的 Hello World ! ";
	}
	@GetMapping("/index")
	public String helloIndex(){
		return "Index ";
	}
}


