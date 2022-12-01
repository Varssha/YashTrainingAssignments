package collections;

import java.util.ArrayList;
import java.util.Collections;

//WAP to sort Collection elements in ascending order.
public class SortCollection {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
        al.add("Hello");
        al.add("Friends");
        al.add("I");
        al.add("Love");
        al.add("Criket");
 
        
        Collections.sort(al);
 
       
        System.out.println("List in ascending order-" +
                           " :\n" + al);
        
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        
        a2.add(10);
        a2.add(1);
        a2.add(9);
        a2.add(5);
        a2.add(2);
        
        Collections.sort(a2);
        
        System.out.println("Integer List in ascending order " +
                " :\n" + a2);
        
        
	}

}
