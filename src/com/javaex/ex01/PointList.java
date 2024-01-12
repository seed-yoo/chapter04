package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	// 필드
	private Point[] pArray;
	private int crtPos;
	
	// 생성자
	public PointList() {
		// 원래 만들지 않음 - 편의상 가정
		pArray = new Point[3];
		crtPos = 0;
	}

	// 메소드 - getter/setter

	// 메소드 - 일반
	public void add(Point p) {
		// 현재 배열 개수 + 1 배열을 새로 만든다
		// 이전 배열의 값을 새 배열에 옮긴다
		// 마지막 방에 새 주소를 추가한다.
		pArray[crtPos] = p;
		//crtPos = crtPos + 1;
		crtPos += 1;
	}
	

	public int size() {
		
		return crtPos;
		
	}
	public Point get(int index) {
		
		return pArray[index];	// index방 안에 있는 Point 주소
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
	
	
	
}
