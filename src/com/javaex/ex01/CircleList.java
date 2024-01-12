package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

	// 필드
	private Circle[] cArray;
	private int crtPos;
	
	// 생성자
	public CircleList() {
		// 원래 만들지 않음 - 편의상 가정
		cArray = new Circle[3];
		crtPos = 0;
	}
	
	// 메소드 - 일반
	public void add(Circle c) {
		// 현재 배열 개수 + 1 배열을 새로 만든다
		// 이전 배열의 값을 새 배열에 옮긴다
		// 마지막 방에 새 주소를 추가한다.
		cArray[crtPos] = c;
		//crtPos = crtPos + 1;
		crtPos += 1;
	}
	

	public int size() {
		
		return crtPos;
		
	}
	public Circle get(int index) {
		
		return cArray[index];	// index방 안에 있는 Point 주소
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
	
	
	
	
	
}
