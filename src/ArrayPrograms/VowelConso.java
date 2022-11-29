package ArrayPrograms;
// You are given a sequence of Character in the form of Array. Now you have to put all vowels and consonants together in the array.
public class VowelConso {

	public static void main(String[] args) {
		
		char[] arr = {'a', 'b', 'c', 'd', 'e','o','i'};  
		
		System.out.print("Vowels Consonants Together--->");
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u') 
				System.out.print(arr[i]);
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u') 
				System.out.print(arr[i]);
			
		}
		
	}

}
