package com.programs;

@FunctionalInterface
interface NumMaster{
	boolean checkNumber(int a);
}

public class LambdasSquare {
	
public static void main(String[] args) {
	

	int[] arr= {12,-2,6,5,-4,0,8,6,1,3};
	
   NumMaster n1=(a)-> a>0 && a%2==1;
	
	for(int a:arr) {
		System.out.print( n1.checkNumber(a)?String.valueOf(a*a)+" ":" ");
	}
	System.out.println("Sum of Square of all positive odd numbers--");
}	
}
