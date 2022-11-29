package StringPrograms;
// WAP to demonstrate which is fast in processing StringBuilder or StringBuffer
public class StringBufferBuilder {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis(); 
		
        StringBuffer sb = new StringBuffer("Hello");  
        for (int i=0; i<10000; i++){  
            sb.append("World");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        
        startTime = System.currentTimeMillis();
       
       StringBuilder str= new StringBuilder("Hello");
        for (int i=0; i<10000; i++){  
            str.append("Java tutorials");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
     
	
	}
}


