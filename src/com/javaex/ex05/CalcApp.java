package com.javaex.ex05;

import java.util.Scanner; //import 스캐너

public class CalcApp {

	public static void main(String[] args) {
    	
    	
    	//스캐너 호출
    	Scanner scanner = new Scanner(System.in);
    	
    	//resule 정수형 변수 선언 및 0으로 초기화
    	int result = 0;
    	
    	//whill문
    	while(true) {
    		System.out.print(">>");;
    		
    		//한 라인을 입력
    		String strLine = scanner.nextLine();
    		
    		//라인이 /q이면 종료
    		if (strLine.equals("/q")) {    // /q는 말하자면 종료버튼을 세팅해주는것
    			System.out.println("종료합니다.");
    			break;  // 반복문 탈출하고싶을때
    		}
    		
    		
    		//분할( split) : "1 + 2" -> { "1", "+", "2"}
    		String[] data = strLine.split(" ");		 
    	
    		int leftNum = Integer.parseInt(data[0]);
    		String operator = data[1];
    		int rightNum = Integer.parseInt(data[2]);
    		// operator 기준으로 Add,Sub,Mul,Div 컴맨드 수행
    		
    	
    	switch (operator) {
    		case "+":
    			Add add = new Add();
    			add.setValue(leftNum, rightNum);
    			result = add.calculate();
    			System.out.println(">>" + result);
    			break;
    			
    		case "-":
    			Sub sub = new Sub();
    			sub.setValue(leftNum, rightNum);
    			result = sub.calculate();
    			System.out.println(">>" + result);
    			break;
    			
    		case "*" :
    			Mul mul = new Mul();
    			mul.setValue(leftNum, rightNum);
    			result = mul.calculate();
    			System.out.println(">>" + result);
    			break;
    			
    		case "/":
    			Div div = new Div();
    			div.setValue(leftNum, rightNum);
    			result = div.calculate();
    			System.out.println(">>" + result);
    			break;
    			
    		default:
    			System.out.println("알 수 없는 연산입니다.");
    			break;
    		
    	
    		}
    		
    	}

    	// scanner close
    	scanner.close();

	}
}
