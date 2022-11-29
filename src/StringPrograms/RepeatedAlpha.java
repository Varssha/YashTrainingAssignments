package StringPrograms;
// WAP to print the number of alphabets repeated in the given string.
public class RepeatedAlpha {

	public static void main(String[] args) {
		
       String str="javawwwvv";
       
       char arr[]=str.toCharArray();
         char temp;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+"  ");
			
		}
       for(int i=0;i<str.length();i++) {
    	   int count=1;
    	   for(int j=i+1;j<str.length();j++) {
    		  
    		    if(arr[i]==arr[j] )
    		    	count++;
    		    	else
    		    		break;
    		    	System.out.println("Letter repeated--"+arr[i]+" count---"+count);
    		    }
    	   
       if(count>1) {
			System.out.print("\n"+arr[i]+"--->"+count);
			i+=(count-1);
		}
       }
       
       
	}

}
