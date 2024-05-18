package tech_Round_pkg;

import java.util.HashMap;
import java.util.Map.Entry;

public class Frequency_Count {
	
	public static void main(String[] args) {
		
		Frequency_Count.countFrequncy();
		Frequency_Count.Frequency_StartsWith();
	}

	public static void countFrequncy() {
		// Count Frequency of each character in String
		
		String s = "Selenium Test"; 	 // s2  e=3 l=1 n=1 i=1 m=1 t=2 
		
		s = s.toLowerCase();  
		s = s.replaceAll("\\s", "");
		
		char[] arr = s.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
			for(char c : arr) {
				
				if(map.containsKey(c)) {
					
					map.put(c, map.get(c)+1);
					
				}else {
					map.put(c, 1);
				}
			}
			
			System.out.println(map);
	}
	
	
	public static void Frequency_StartsWith() {
		// count frequency & print if String Starts with 'A'
		
			String[] arr = {"Arambh" , "Akash", "Thakare", "Supriya", "Akash",  "Thakare"};
			
			HashMap<String, Integer> familyMap = new HashMap<>();
			
			for(String s :arr) {
				
				if(familyMap.containsKey(s)) {
					
					familyMap.put(s, familyMap.get(s)+1);
					
				}else {
					familyMap.put(s, 1);
				}
			}
			
			for(Entry entry : familyMap.entrySet()) {
			
				String key	= entry.getKey().toString();
				
				if(key.startsWith("A")) {
					System.out.println(entry);
				}
				
			}
			
	}
	
}
