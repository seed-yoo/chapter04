package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		// 점 관리
		MyList<Point> pList = new MyList<Point>();
		Point p01 = new Point(2,2);
		Point p02 = new Point(12,12);
		Point p03 = new Point(22,22);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.toString());
		
		// 원 관리
		MyList<Circle> cList = new MyList<Circle>();
		Circle c01 = new Circle(200);
		Circle c02 = new Circle(500);
		Circle c03 = new Circle(100);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		//cList.add(p01);	--> 출력이 불가하다
		
		
		System.out.println(cList.toString());
		
	}
}
