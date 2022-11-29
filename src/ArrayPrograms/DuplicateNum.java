package ArrayPrograms;
//WAP to find duplicate numbers and there counting from list of numbers.
public class DuplicateNum {

	public static void main(String[] args) {
		int arr[]= {20,10,40,60,20,45,20,60,45,20};
		int temp;
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+"  ");
			
		}

		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) 
					count++;
				else 
					break;
				
			}
			if(count>1) {
				System.out.print("\n"+arr[i]+"--->"+count);
				i+=(count-1);
			}
		}
		
		
		
		
		
		
		
	}

	
	
	

}

