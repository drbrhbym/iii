package com.iii.CB104;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Hello world, welcome to Java world";
		char c = str.charAt(6);
        System.out.println(c);
        System.out.println(str.length());
        System.out.println(str.charAt(6));
        System.out.println(str.substring(13));
        System.out.println(str.substring(0,11));
        
        int index = str.indexOf("world");
        System.out.println(index);
        System.out.println(str.indexOf("world" , index + 1));
        
        String[] tokens = str.split(" ");
        for (int i = 0; i < tokens.length; i++)
        	System.out.println(tokens[i]);
        
        tokens = str.split(",");
        for (int i = 0; i < tokens.length; i++)
        	System.out.println(tokens[i]);
        
        String date = "2015-05-06";
        System.out.println(date.replace('-', '/'));
        
        System.out.println(str.toUpperCase());
        
        String str1 = "    Hello YOYOYOY   ";
        System.out.println(str1.trim());
	}

}
