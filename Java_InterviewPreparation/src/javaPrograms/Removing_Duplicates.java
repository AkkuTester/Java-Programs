package javaPrograms;

public class Removing_Duplicates {

	// Reason to use StringBuilder / emptyString with String >> to retrieve each char in sequence as Set returns char in Random way 

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		RemoveDuplicates.usingStringBuilder();
		RemoveDuplicates.usingNormalString();
	}

	public static void usingNormalString() {
	// Remove Duplicates using Normal String
		
		String s = "selenium"; 	 // selnium
		
		String withoutDuplicate = "";
		HashSet<Character> set = new HashSet<>();
		
		for(char c : s.toCharArray()) {
			if(set.add(c)) {
			  withoutDuplicate = withoutDuplicate + c;
			}
		}
		System.out.println(withoutDuplicate);
	}
	
	
	public static void usingStringBuilder() {
	//Remove Duplicates using String Builder

		String s = "automation Testing" ;  // automin Tesg 
		
		HashSet<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for(char c : s.toCharArray()) {	
	    	   if(set.add(c)) {
	      	     sb.append(c);
	    	   }	
		}
		System.out.println(sb);	
	}

}
