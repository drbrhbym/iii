package com.iii.CB104;

public class MathDemo {

	public static void main(String[] args) {
		System.out.println(Math.rint(3.8));
		System.out.println(Math.rint(2.5));
		System.out.println(Math.rint(3.5));
		System.out.println(Math.floor(3.8));
		System.out.println(Math.floor(-3.8));
		System.out.println(Math.sqrt(9888));
		
		System.out.println((int)(Math.random()*101));
		
		int low = 50, high = 100;
		System.out.println((int)(Math.random()*(high-low+1)+low));

	}

}
