package javaPrograms;

import java.util.HashSet;

public class Removing_All_Duplicates_Using_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "automation";
	System.out.println(s);
	System.out.println("size of string " + s.length() );
	HashSet<Character> sset = new HashSet<>();
	
	for(int i=0; i<s.length(); i++) {
		
		sset.add(s.charAt(i));
	}

	System.out.println(sset);
	System.out.println("after removing duplicates " + sset.size());
	}
}