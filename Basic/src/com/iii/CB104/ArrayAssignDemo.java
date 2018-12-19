package com.iii.CB104;

public class ArrayAssignDemo {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6 };
		
		int[] data1 = new int [data.length];
		for (int i = 0; i < data.length; i++) {
			data1[i] = data[i];
		System.out.println(data1[i]);
		}
		
		int [] data2 = data;
		for(int i = 0; i < data.length - 3; i++) {
            data[i]*=10;
            
		}
	   
		
		
	}
}
