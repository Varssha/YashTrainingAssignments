package ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

//WAP to sort array on the basis of unit place.
public class SortArrayAtUnit {

	public static void main(String[] args) {
	
		
		int arr[] = {14, 100, 99,12,133};
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] % 10 > arr[j]%10) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}

		
		
		
		
	
	}


}