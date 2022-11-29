package StringPrograms;
// WAP to remove all the vowels from the given string.
public class VowelString {

	public static void main(String[] args) {
		
     String s="Varsha";
     
     for(int i=0;i<s.length();i++) {
    	 if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                 || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                 || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                 || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                 || s.charAt(i) == 'O'
                 || s.charAt(i) == 'U') {
                 continue;
             }
             else {
                 System.out.print(s.charAt(i));
             }
	}
     
     
     

	}
}