package com.iii.CB104;

public class Iteration {

	public static void main(String[] args) {
		
		int n = 1;
		int sum = 0;
		while (n <= 10) {
			sum += n;
			n++;
		}
	    System.out.println(sum);
	    
	    n = 1;
	    sum = 0;
	    do {
	    	sum += n;
	    	n++;
	    } while (n <= 10);
	    System.out.println(sum);
	    
	    sum = 0;
	    for (n = 1; n <= 10; n++) 
	    	sum += n;
	    	System.out.println(sum);	
	    
	    sum = 0;
	    for (n = 10; n >= 1; n--)
	    	sum +=n;
	        System.out.println(sum);
	    
	    sum = 0;
		for (n = 1; n <= 10; n += 2) 
		    sum += n;
		    System.out.println(sum); //©_¼Æ
		
		sum = 0;
		for (n = 0; n <= 10; n += 2) 
			 sum += n;
			 System.out.println(sum);//°¸¼Æ
	}

}
