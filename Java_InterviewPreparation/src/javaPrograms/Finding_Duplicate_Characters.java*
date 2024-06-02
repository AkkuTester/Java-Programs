package javaPrograms;


import java.util.HashSet;

public class Finding_Duplicate_Characters {

	public static void main(String[] args) {
		// Finding_Duplicate_Characters

		String s ="automation testing";
		
	s=	s.replaceAll("\\s", "");
	char arr[] =	s.toCharArray();
	
	HashSet<Character> dupElements = new HashSet<>();
	
	for(int i=0; i<arr.length; i++) {
		int count = 1;
		
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i] == arr[j]) {
				count++;
			}
		}
		if(count >1) {
			dupElements.add(arr[i]);
		}
	}
	System.out.println(dupElements);
		
	}

}
