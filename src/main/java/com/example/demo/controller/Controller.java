package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*" , allowedHeaders = "*")
@RestController
public class Controller {

	
	@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
	@GetMapping("/validacion")
	public String getValidacion() {
		return "validado";
	}
	
}

