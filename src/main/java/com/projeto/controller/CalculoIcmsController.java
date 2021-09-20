package com.projeto.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class CalculoIcmsController {

	
	@PostMapping
	@RequestMapping("/calculoicms")

	public String compare(
			@RequestParam("valor") Double valor, 
			@RequestParam("icms") Double icms)
	{
		  double resul = (valor + ((valor*icms)/100));
		  
		  String dateReturn = "Resultado: " + resul;
	      return dateReturn;
	}
}
