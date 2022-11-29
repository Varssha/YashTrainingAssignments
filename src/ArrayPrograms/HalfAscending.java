package ArrayPrograms;
// Suppose that you are having an array of size N. now your task is to sort the half array that is from 0 to N/2 in ascending order and N/2+1 to N in descending order. 
public class HalfAscending {
	static void printOrder(int[] arr, int n)
	{
	    //sorting
	    for (int i = 0; i < arr.length; i++)   
	    {  
	    for (int j = i + 1; j < arr.length; j++)   
	    {  
	    int tmp = 0;  
	    if (arr[i] > arr[j])   
	    {  
	    tmp = arr[i];  
	    arr[i] = arr[j];  
	    arr[j] = tmp;  
	    }  
	    }  
	   
	    }
	    
	    for (int i = 0; i < n / 2; i++)
	        System.out.print(arr[i]+" ");
	 
	    
	    for (int j = n - 1; j >= n / 2; j--)
	    System.out.print(arr[j]+" ");
	     
	}
	public static void main(String[] args) {
		
		int[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7,10 ,12,0};
	    int N= arr.length;
	    System.out.println("length of the array"+N);
	    printOrder(arr, N);

	}

}
