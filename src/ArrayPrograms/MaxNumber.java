package ArrayPrograms;

import java.util.Arrays;

//WAP to find third maximum number from list of numbers.
public class MaxNumber {

	public static void main(String[] args) {
		int temp;
		int array[] = {10, 20, 25, 63, 96, 50};
		
		   
		   for(int i = 0; i<array.length; i++ ){
		      for(int j = i+1; j<array.length; j++){
		         if(array[i]>array[j]){
		            temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		         }
		      }
		   }
		   System.out.println("Third maximum number from list is:: "+array[array.length-3]);
		   }
		}