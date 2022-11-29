package StringPrograms;

import java.util.Scanner;

// Create a program in which two string is input by the user and after that user will enter index in first string where we want to insert the second string and insert the second string at that index and create a new string 
public class InputString {
   //s1=test s2=success s3=2 index s=tessuccesst
	public static void main(String[] args) {
		System.out.println("Enter the string1-->");
		Scanner sc=new Scanner(System.in);
	     String str1=sc.nextLine();
	     System.out.println("Enter the String2-->");
	     
	     Scanner sc1=new Scanner(System.in);
	     String str2=sc1.nextLine();
	     
	     System.out.println("Enter the string index--->");
	     Scanner sc2=new Scanner(System.in);
	     int index=sc2.nextInt();
	     
	     
	     String newString = new String();
	     
	        for (int i = 0; i < str1.length(); i++) {
	  
	            newString += str1.charAt(i);
	  
	            if (i == index) {
	                newString += str2;
	            }
	        }
	  
	        System.out.println(newString);
	        System.out.println("String1--"+str1+" String2--"+str2+"  index---"+index+"  NewString--"+newString);
	    }
	     
	}


