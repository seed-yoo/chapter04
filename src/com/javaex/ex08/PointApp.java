package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<String, Point>();

		Point p01 = new Point(2, 100002);
		Point p02 = new Point(5, 5);
		Point p03 = new Point(12, 22);

		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);

		System.out.println(pMap.size());
		System.out.println(pMap.toString());

		System.out.println(pMap.get("정우성").getY());

		Point p04 = new Point(100, 100);
		pMap.put("박명수", p04);
		System.out.println(pMap.toString());

		// 키목록 [정우성, 박명수, 이효리]	--> 순서는 랜덤이다.
		Set<String> keys = pMap.keySet();
		
		// 키 전체 출력하기
		/*
		for (String name : keys) {
			System.out.println(name);
		}
		*/
		
		// 전체출력하기
		for (String name : keys) {
			System.out.println(name);
			System.out.println(pMap.get(name).toString());
			System.out.println(pMap.get(name).getY());
		}

	}

}
