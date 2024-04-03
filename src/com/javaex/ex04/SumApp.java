package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		//split
		String[] mySplit = numLine.split(" ");
		//문자열 -> 숫자로 바꿔주자
		
		// 문자열이 숫자들의 집합이다? 그럼 숫자의 배열 안에 각각 다 넣어주자
		for (int i = 0; i < mySplit.length; i++) {
			sum +=  Integer.parseInt( mySplit[i] );
		}
		// 그걸로 합
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
