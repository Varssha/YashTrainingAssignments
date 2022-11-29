package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

// WAP to create a dynamic array. Dynamic Array means when user want to input the number more than size of array it will increase the size of array without throwing exception.

//An Array contain the n numbers you have to find out combination which satisfy Pythagoras Template. ( Pythagoras templates:- 3*3+4*4==5*5)
public class DynamicArray {

	private int arr[];
	private int count;

	public DynamicArray(int length) {
		arr = new int[length];
	}

	public int[] printArray() {

		for (int i = 0; i < count; i++) {

			System.out.print(arr[i] + " ");
			
		}
		
		return arr;
	}

	public void insert(int element) {
		if (arr.length == count) {

			int newArr[] = new int[2 * count];

			for (int i = 0; i < count; i++) {
				newArr[i] = arr[i];
			}

			arr = newArr;
		}

		arr[count++] = element;
	}

	
	static void printPythagoreanTriplets(int[] array){
        int i,j,k;
        int x,y,z;
       
        for(i=0;i<array.length;i++){
            x=array[i];
            for(j=0;j<array.length;j++){
                y=array[j];
                for(k=0;k<array.length;k++){
                    z=array[k];
                    if((z*z)==(x*x + y*y)){
                       
                        System.out.println("Pythagoras template--"+x+", "+y+", "+z);
                        
                    }
                }
            }
        }
	}
	public static void main(String[] args) {
      
       Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size---");
		 int m=sc.nextInt();

		DynamicArray numbers = new DynamicArray(m);
		
		numbers.insert(3);
		numbers.insert(4);
		numbers.insert(5);
		numbers.insert(2);
		
		int[] arr=numbers.printArray();
		//System.out.println(arr);
		printPythagoreanTriplets(arr);
		
		
	}
}
