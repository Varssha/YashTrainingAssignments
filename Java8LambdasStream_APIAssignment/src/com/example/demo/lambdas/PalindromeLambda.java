package com.example.demo.lambdas;

import java.util.Scanner;
import java.util.stream.IntStream;
//WAP to check the given no is palindrome or not. Don’t use divide method. 
public class PalindromeLambda {
	
	public static boolean isPalindrome(int number) {

	    return number == IntStream.iterate(number, i -> i / 10)
	        .map(n -> n % 10)
	        .limit(String.valueOf(number).length())
	        .reduce(0, (a, b) -> a = a * 10 + b);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int num=new Scanner(System.in).nextInt();
		
		boolean ispal =isPalindrome(num);
		
		if(ispal) {
			
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}
		
		
		
	}

}
