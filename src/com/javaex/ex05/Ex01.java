package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		Integer i01 = 3;
		Integer i02 = 6;
		Integer i03 = 9;
		
		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);
		
		System.out.println(iSet.toString());
		System.out.println(iSet.size());
		
		System.out.println("======================================");
		// for	while
		// 향상된 for문
		for (Integer num : iSet) {
			System.out.println(num.toString());
		}
		
		System.out.println("======================================");
		Integer i04 = 6;
		iSet.add(i04);
		System.out.println(iSet.size());
		System.out.println(iSet.toString());
		
		for (Integer num : iSet) {
			System.out.println(num.toString());
		}
		
		
		
		
	}
}
