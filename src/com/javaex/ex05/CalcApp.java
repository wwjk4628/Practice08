package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Add myAdd = new Add();
		Div myDiv = new Div();
		Mul myMul = new Mul();
		Sub mySub = new Sub();
		
		
		
		Scanner sc = new Scanner(System.in);
		String numLine = null;
		String[] mySplit;
		
		while (numLine != "/q") {
			
			System.out.println("숫자를 공백으로 구분해서 입력하세요");
			numLine = sc.nextLine();
			
				// split
			if (numLine.equals("/q")) {
				System.out.println("종료");
				break;
			} else {
				mySplit = numLine.split(" ");
			} 
				
			
			
				try {
				myAdd.setValue(Integer.parseInt(mySplit[0]), Integer.parseInt(mySplit[2]));
				myDiv.setValue(Integer.parseInt(mySplit[0]), Integer.parseInt(mySplit[2]));
				myMul.setValue(Integer.parseInt(mySplit[0]), Integer.parseInt(mySplit[2]));
				mySub.setValue(Integer.parseInt(mySplit[0]), Integer.parseInt(mySplit[2]));
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

				} else {
					System.out.println("알 수 없는 연산입니다.");
				}
				} catch(NumberFormatException e) {
					System.err.println("숫자입력해주세요");
				}
				catch (ArrayIndexOutOfBoundsException e) {
					System.err.println("범위에 맞게 입력해주세요");
				}
				
			}
		sc.close();
	}
			
		}

	

