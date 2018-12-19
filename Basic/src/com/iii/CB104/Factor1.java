package com.iii.CB104;

public class Factor1 {

	
	static long factorial(long num) {
	    long result = 1;
		for (long i = num; i >= 1; i--)
			result *= i;
		return result;
	}
	
	public static void main(String[] args) {
 
		int num = Integer.parseInt(args[0]);
		
		System.out.println("\n"+num + "!=" + factorial(num));
		
            
	}

}

