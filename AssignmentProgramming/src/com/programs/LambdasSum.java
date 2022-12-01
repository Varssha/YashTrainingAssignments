package com.programs;

import java.util.ArrayList;

public class LambdasSum {

	public static void main(String[] args) {
		
	
     String[] names = {"sally", "Dylan", "rebecca", "Diana", "Joanne", "keith"};  
	
		/*
		 * sample_names = ['sally', 'Dylan', 'rebecca', 'Diana', 'Joanne', 'keith']
		 * sample_names=list(filter(lambda el:el[0].isupper() and
		 * el[1:].islower(),sample_names)) print("Result:")
		 * print(len(''.join(sample_names)))
		 */
     
	int N= names.length;
	
	ArrayList<String> list= getlongestString(names,N);
	
	 for (String st : list)
	      System.out.print(st.length()+"" + " ");
	  
}

	private static ArrayList<String> getlongestString(String[] names, int n) {
		ArrayList<String> ans = new ArrayList<String>();
		
		
		for(int i=0;i<n;i++) {
			 if (isContainUpperCase(names[i])) {
			        ans.add(names[i]);
			      }
		}
		return null;
	}

	private static boolean isContainUpperCase(String str) {
		int first=0;
		//if(str.charAt(first))
		return false;
	}
}