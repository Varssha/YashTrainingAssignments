package ArrayPrograms;
// An Array Contain different numbers you have to find how many are even, odd, perfect and prime 
public class DifferentNumbers {

	public static void main(String[] args) {

		int array[] = {1,2,3,4, 5,7};

		int even_count = 0;
		int odd_count = 0;
		int perfect_count = 0;
		int prime_count = 0;
		
       
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1)
				odd_count++;

			else
				even_count++;
             
		}
		
		for(int i=0;i<array.length;i++) {
			int n= i;
			int a=2;
			int temp =0;
			while(a<=(n/2)) {
				if((n%a)==0) {
					temp++;
					break;
				}
				a++;
			}
			if(temp ==0 && i!=1) {
				prime_count++;
			}
		}
		
		for(int i=0;i<array.length;i++) {
			int m=i;
			int f=1;
			int sum=0;
			while(f<=(m/2)) {
				if((m%f)==0){
					sum=sum+f;
					
				}
				f++;
			}
			if(sum==i) {
				perfect_count++;
			}
		}
		
		System.out.print("\n Odd Numbers count -" + odd_count);
		System.out.print("\n Even Numbers Count-" + even_count);
		System.out.print("\n Prime Numbers Count-"+ prime_count);
		System.out.print("\n Perfect Number Count -"+perfect_count);
	}
	
}
