package com.javaex.ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {
		// add(), size(), get(), remove()
		List<Point> pList = new ArrayList<Point>();
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		pList.add(p01);
		
		/*
		// 위에 ArrayList<Point>로 선언되어 있어서 사용할 수 없다
		Circle c01 = new Circle(5);
		pList.add(c01);
		*/
		
		System.out.println("size: " + pList.size());
		
		
		// ================================================
		// 변수로 y값
		System.out.println(p01.getY());
		
		// 리스트를 통한 y값
		/*
		Point var01 = pList.get(0);
		var01.getY();
		*/
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString());
		System.out.println("====================================");
		// 전체 출력
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		System.out.println("====================================");
		
		pList.remove(0);		// --> 리스트 안의 0번의 방을 지움
		// 전체 출력
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("====================================");
		pList.remove(p02);
		// 전체 출력
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println(pList.toString());
		
		// pList.sAdd();
		
		// ==========================================================
		
		List<Integer> iList = new ArrayList<Integer>();
		
		
		Integer i01 = new Integer(3);
		Integer i02 = 6;
		
		iList.add(i01);
		iList.add(i02);
		
		System.out.println(iList.toString());
		
		
		
		
		
		
		
		
		
	}
}
