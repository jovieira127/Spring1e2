package com.helloword.helloWord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController2 {
	@GetMapping("/segundoHello")
	public String objetivosAprendizagem() {
		return "Aprender com eficiência os conceitos de Spring e conseguir aplica-los";
	}

}
