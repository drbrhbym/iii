package com.iii.CB104;

public class Recursive {
    
	static void method(int n) {
		System.out.println("level"+n);
		if (n<4) method(n+1);
		System.out.println("LEVEL"+n);
	}
	
	public static void main(String[] args) {
		method(1);

	}

}
