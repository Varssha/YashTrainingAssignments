package com.programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputString {
	
	public static void main(String[] args) throws NameInvalidException {
		System.out.println("Enter the String----");
		
		Scanner sc= new Scanner(System.in);
		 String str= sc.nextLine();
		 
		 String regex="^[a-z0-9]";
		 Pattern pattern = Pattern.compile(regex);  
	     Matcher matcher = pattern.matcher(str);
	     
	     
	     if(pattern.matcher(str).matches() || (str.length()<7) ) {
			throw new NameInvalidException("Please enter valid string");
		
	     }else if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'){
			System.out.println("the String is "+str);
		}
		
		
	}

}
