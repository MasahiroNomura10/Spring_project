package com.example.demo.fizzBuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;






@Service
public class FizzBuzzService {
	

	//文字列変換用
	String conversionNum = "";

	public String[] fizzBuzz() {
		
		//リストの初期化
		List< String > list = new ArrayList<>();

		String[] arry;
		
		for( int i = 0; i <= 100; i++ ) {
			
			if( i%3 == 0 && i%5 == 0 ) {
				
				list.add( "FizzBuzz" );				
			
			}else if ( i%3 == 0 ) {

				list.add( "Fizz" );
				
			}else if( i%5 == 0 ) {

				list.add( "Buzz" );				
				
			}else {
				//int型をString型に変換
				conversionNum = Integer.valueOf( i ).toString();
				list.add( conversionNum );
			}
			
		}
		
		//戻り値の為にリストを配列に変換
		arry = list.toArray( new String[ list.size() ] );
		
		return arry;
	}	
	
}
