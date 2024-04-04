package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//toString()을 작성 하세요
	@Override
	public String toString() {
		System.out.printf("[포인트] x=%d, y=%d 입니다.%n", x , y);
		return "[포인트] x=" + x +", y=" + y +" 입니다.";
	}
}
