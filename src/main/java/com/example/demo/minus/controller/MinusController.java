package com.example.demo.minus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.MinusService;






@Controller
public class MinusController {

	MinusService minus = new MinusService();
	
	public MinusController( MinusService minusService ) {
		
		this.minus = minusService;
	}
	
	
	//スタート画面
	@GetMapping( "/spring_03")
	public String spring_03(){
		return "minus";
	}
	
	
	//計算後画面
	@GetMapping("calculationAnswer")
	public String calculationAnswer( @RequestParam( "num1" )int num1, @RequestParam( "num2" )int num2, Model model ) {
				
		//String result = "";
		String n1 ="";
		

		n1 = String.valueOf( num1 );
		
		model.addAttribute("num1", n1);
		
//		result = String.valueOf( minus.minus( num1, num2 ) );
//		
//		
//		model.addAttribute( "result", result );
		
		
		return "minus";
	}
	
	
	
}
