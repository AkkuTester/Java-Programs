package javaPrograms;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s = " !@$%^^&*(_+-=) Automation Testing 012365" ;	
		
	s =	s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s);
	
	String s1 = "Auto mation Test ing";
	
	//s1 = s1.replaceAll("\\s", "");
	s1 = s1.replaceAll("\\s", "");
	System.out.println(s1);
	}

}
