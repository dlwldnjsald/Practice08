package com.javaex.ex07;

//요청 사항: 필드 x가 같으면 동등객체로 취급하자
public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요. 오버라이드 해주기
	@Override
	public boolean equals(Object obj) {
		//매개변수 (비교대상)-> Point 로 캐스팅 
		
		if(obj instanceof Point) { 	//obj가 Point로 캐스팅가능?
			//캐스팅
			Point other = (Point)obj;
			return this.x == other.x;
			
		}
		return super.equals(obj); //부모님께 수퍼로 리턴 위임 
	}
	
}
