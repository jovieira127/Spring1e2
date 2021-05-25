package com.helloword.helloWord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	@GetMapping("/primeiroHello")
	public String habilidadesMentalidades() {
		return "Persistência e Orientação ao futuro";
	}

}
