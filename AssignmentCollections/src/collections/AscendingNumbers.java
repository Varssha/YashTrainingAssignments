package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//WAP to store elements in List and remove all duplicates value from it. (Numbers 
//should be inserted). When duplicates are removed print all elements in ascending 
//order.
public class AscendingNumbers {

	public static void main(String[] args) {
		System.out.println("Enter size of numbers");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Integer> numbers = new ArrayList<Integer>();

		System.out.println("Enter list of numbers");
		for (int i = 0; i < n; i++)
		numbers.add(sc.nextInt());
		System.out.println(numbers);

		Set<Integer> set = new TreeSet<Integer>();
		set.addAll(numbers);
		System.out.println(set.toString());

	}

}
