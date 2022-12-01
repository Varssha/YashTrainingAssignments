package com.programs;

import java.util.HashMap;
import java.util.Map;

public class HighestFrequency {
	
	public static void main(String[] args) {
		
	
	String str="I love java  because java is good" ;
	
	 String a[] = str.split(" ");
	 
     Map<String, Integer> words = new HashMap<>();
     
     for (String str1 : a) {
         if (words.containsKey(str1)) {
             words.put(str1, 1 + words.get(str1));
         } else {
             words.put(str1, 1);
         }
     }
     System.out.println(words);
		
}
		 
}
