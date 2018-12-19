package com.iii.CB104;

import java.util.Scanner;

public class Factor {

	
	static long factorial(long num) {
	    long result = 1;
		for (long i = num; i >= 1; i--)
			result *= i;
		return result;
	}
	
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number:");
		long number = sc.nextInt();
		sc.close();
		System.out.println("\n"+number + "!=" + factorial(number));
		
            
	}

}
