package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
class SortHashmap {
 
   
    static Map<String, Integer> map = new HashMap<>();
 
    
    public static void sortbykey()
    {
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(map);
 
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println("Key City name= " + entry.getKey() +
                         ",Population Value = " + entry.getValue());       
    }
     
    
    public static void main(String args[])
    {
        
        map.put("Pune", 80000);
        map.put("Nashik", 90000);
        map.put("Nagpur", 60000);
        map.put("Akola", 50000);
        map.put("Amravati", 90000);
 
        sortbykey();
    }
}