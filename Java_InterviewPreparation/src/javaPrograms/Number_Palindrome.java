package numberPrograms;

public class ForLoopDemo {

	public static void main(String[] args) {
		// Reverse a number & check if it is palindrome

		int n = 474 ; int rev = 0; int nCopy = n;
		
		while(n != 0) {
			int rem = n%10;
			rev = rev *10 + rem ;
			n = n/10;
		}
		System.out.println(rev);
		
		if(rev == nCopy) {
			System.out.println("Given no is palindrome");
		}
	}

}
