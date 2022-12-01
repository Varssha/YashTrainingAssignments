package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//WAP to store all Collection elements in Array and perform the Binary Search
public class BinarySearch {

	public static void main(String[] args) {
		
		 List<Integer> al = new ArrayList<Integer>();
	        al.add(1);
	        al.add(4);
	        al.add(3);
	        al.add(10);
	        al.add(20);
	  
	         
	        int index = Collections.binarySearch(al, 10);
	        
	       if(index<0) {
	    	   System.out.println("element is not present"+index);
	       }else {
	    	   System.out.println("element "+index);
	       }
	         
	        
	        
	        
	       
	}

}
