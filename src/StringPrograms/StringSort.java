package StringPrograms;

import java.util.Scanner;

// WAP to print the all alphabets of string in ascending and descending order.
public class StringSort {

	public static void main(String[] args) {

		System.out.println("Enter the String");

		Scanner sc = new Scanner(System.in);
		String s2 = sc.nextLine();
		char arr[] = s2.toCharArray();
		char temp;
       //Descending
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
     System.out.print("Descening----->");
		System.out.println(arr);
		//Ascending 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Ascending----> ");
		System.out.println(arr);
	}

	
	
}
