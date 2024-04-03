package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	Add myAdd = new Add();
    	Div myDiv = new Div();
    	Mul myMul = new Mul();
    	Sub mySub = new Sub();
    	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();
		//split
		String[] mySplit = numLine.split(" ");
		myAdd.setValue(Integer.parseInt( mySplit[0] ),
				Integer.parseInt( mySplit[2] ));
		myDiv.setValue(Integer.parseInt( mySplit[0] ),
				Integer.parseInt( mySplit[2] ));
		myMul.setValue(Integer.parseInt( mySplit[0] ),
				Integer.parseInt( mySplit[2] ));
		mySub.setValue(Integer.parseInt( mySplit[0] ),
				Integer.parseInt( mySplit[2] ));
    	if (mySplit[1].equals("+")) {
    		int result = myAdd.calculate();
    		System.out.println(result);
    	} else if (mySplit[1].equals("-")) {
    		int result = mySub.calculate();
    		System.out.println(result);
    	} else if (mySplit[1].equals("*")) {
    		int result = myMul.calculate();
    		System.out.println(result);
    	} else if (mySplit[1].equals("/")) {
    		int result = myDiv.calculate();
    		System.out.println(result);
    	}
    	
    }
}
