package com.example.demo.minus.service;

import org.springframework.stereotype.Service;






@Service
public class MinusService {

	
	private String val1;
	private String val2;

	public String getVal1() {
		return val1;
	}

	public void setVal1(String val1) {
		this.val1 = val1;
	}

	public String getVal2() {
		return val2;
	}


	public void setVal2(String val2) {
		this.val2 = val2;
	}

}


//@Service
//public class MinusService {
//	
//		
//	public int minus( int num1, int num2 ) {
//		
//		return num1 - num2;
//	}
//}
