package com.example.demo.fizzBuzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.fizzBuzz.service.FizzBuzzService;




@Controller
public class FizzBuzzController {
	
	
	
	private final FizzBuzzService servic;
			

	public FizzBuzzController( FizzBuzzService fizzBuzzService ) {
		this.servic = fizzBuzzService;
	}
	
	@GetMapping("/spring_02")
	public String spring_02( Model model ) {

		String[] fbList = new String[ 100 ];
		
		fbList = servic.fizzBuzz();
		
		model.addAttribute( "fbList", fbList );
		
		return "fizzBuzz";
	}

}
