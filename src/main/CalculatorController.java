package main;

import func.Calculator;

public class CalculatorController {
	public static void main(String[] args){
		
		//入力した数が2つ以下のエラー
		//if(args.length != 2){
		//	System.out.println("数字を二つ入力してください");
		//	return;
		//}
		
		//電卓の提言
		Calculator calc = new Calculator();
		
		//変数への代入
		//int x = Integer.parseInt(args[0]);
		//int y = Integer.parseInt(args[1]);
		int x = 1;
		int y = 0;
		
		//計算
		int result1 = calc.add(x,y);
		int result2 = calc.minus(x,y);
		int result3 = calc.multi(x,y);
		int result4 = calc.divi(x,y);
		
		//出力
		System.out.println(x + "+" + y + "=" + result1 + "です");
		System.out.println(x + "-" + y + "=" + result2 + "です");
		System.out.println(x + "×" + y + "=" + result3 + "です");
		System.out.println(x + "/" + y + "=" + result4 + "です");
		}
	}

