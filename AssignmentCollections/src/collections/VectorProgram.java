package collections;

import java.util.Collections;

import java.util.Vector;

//WAP to store data related to item in Vector and after that sort the data. 
public class VectorProgram {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<Integer>();
		  
          vec.add(1);
          vec.add(2);
          vec.add(5);
          vec.add(9);
          vec.add(7);
          vec.add(4);
          vec.add(3);
       
        System.out.println("original vector : " + vec);
  
       
        Collections.sort(vec);
  
        
        System.out.println("\nsorted vector : " + vec);

	}

}
