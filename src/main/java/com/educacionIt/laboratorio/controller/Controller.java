package com.educacionIt.laboratorio.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/validacion")
	public String getValidacion() {
		return "validado";
	}
	
}
