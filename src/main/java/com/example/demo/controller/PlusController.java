package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.Pluservice;


@Controller
public class PlusController {
	
	private final Pluservice plusService;
	
	public PlusController( Pluservice plusService ) {
		
		this.plusService = plusService;
	}
	
	@GetMapping("plus")
	public String plus( Model model ) {
		
		String result = "";
		
		result = String.valueOf( plusService.plus(5, 6) );
		
		model.addAttribute("result", result );
		
		return "plus.html";
	}
	

}
