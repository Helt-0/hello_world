package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo-semana")
public class ObjetivosSemana {
	@GetMapping
	public String Objetivo() {
		return "Absorver com eficácia todo o conteúdo apresentado!" ;	
	}
}
