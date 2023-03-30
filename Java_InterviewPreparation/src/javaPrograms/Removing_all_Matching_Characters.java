package javaPrograms;

public class Removing_all_Matching_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "automation";
	System.out.println(s);
	for(int i=0; i<s.length(); i++) {
		int count = 1;
		
		for(int j=i+1; j<s.length(); j++) {
			
			if(s.charAt(i) == s.charAt(j)) {
				count++;
			}
		}
		if(count>1) {
			char temp =	s.charAt(i);
			s=s.replaceAll(Character.toString(temp), "");
		}
	}
	
	System.out.println(s);
	}

}
