package com.javaex.ex07;

import com.javaex.ex07.Point;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// equals() 메소드를 작성하세요.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			// 전달 받은 파라미터 obj가 Point 인지 확인
			// obj => Point로 캐스팅
			Point other = (Point) obj;
			// 두 객체의 동등성
			// 두 객체의 x필드가 같고, 두 객체의 y필드가 같아야 동등하다.
			return this.x == other.x;

		}
		// obj가 Point가 아님
		return super.equals(obj);

	}
}
