package StringPrograms;
//WAP to demonstrate how memory is allocated to string objects in memory heap and string constant pool.
public class StringMemory {

	public static void main(String[] args) {
		String s1 = "Java";  
		String s2 = "Java";  //SCP
		
		String s3 = new String("Java");  //heap memory
		String s4 = new String("Java").intern(); //return from SCP
		
		System.out.println((s1 == s2)+", String are equal."); // true  
		System.out.println((s1 == s3)+", String are not equal."); // false  
		System.out.println((s1 == s4)+", String are equal."); // true  

	}

}
