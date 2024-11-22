package com.example.demo.multi.controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.multi.service.MultiService;



@Controller
public class MulitiController {

	//final修飾子を使用の為、インスタンス化不要
	private final MultiService multiService;
	
	//コンストラクタでサービスクラスを持ってくる
	public MulitiController( MultiService multiService ) {
		this.multiService = multiService;
	}
	
	
	@GetMapping( "spring_01" )
	public String spring_01( Model model ) {
				
		//文字列初期化
		String result = "";
		
		//サービスクラスから計算メソッドを呼んで計算した値を文字列に変換する
		result = String.valueOf( multiService.calculation( 10, 3 ));
		
		//htmlファイルにある「result」に値を渡す
		model.addAttribute( "result", result );
		
		//.htmlの記載無しでも表示可
		return "multi";
				
	}
}
