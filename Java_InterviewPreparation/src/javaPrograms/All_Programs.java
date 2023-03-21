package javaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class All_Programs {
	
	//@Test(priority = 1)
	public void swapNums() {
		
		int a = 150; int b = 300; int c;
		//Swapping of numbers
		c =a; a=b; b=c;
		System.out.println("value of a after swaping =" + a);System.out.println("value of b after swapping = " + b);
	}

	//@Test
	public void reverseNum() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = sc.nextInt();
		
		System.out.println("entered number is = " + num);
		
		int rev = 0;
		while(num>0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("number after reverse = " + rev);
	}
	
	//@Test
	public void reverseStringLogic1() {	
		// approach 1
		String s = "string";
		
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i) + " ");
		}
		
	}
//	@Test
	public void reverseStringLogic2() {
		String s = "string";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
	}
	
//	@Test
	public void reverseStringLogic3() {
		String s = "String";
		String rev = "";
		
		char a[] = s.toCharArray();
		
		for(int i =a.length-1 ; i>=0 ; i--) {
			System.out.print(a[i]);
		}
	}
	
//	@Test
	public void palindromNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		int num = sc.nextInt();
		//make a copy of a number
		int copy = num;				//1234
		int rev = 0;
		// now reversing a number
		while(num>0) {
			
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(copy ==rev) {
			System.out.println(copy +  " is a palindrom number");
		}else
			System.out.println(copy + " is a no a palindrom number");
	}
	
//	@Test
	public void palindromString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		
		String copy = s;
		
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i-- ) {
			rev = rev + s.charAt(i);
		}
		if(copy.equals(rev)) {
			System.out.println(copy + " is a palindrom string");
		}else
			System.out.println(copy + " is not a palindrom");
	}
	
//	@Test
	public void numOfDigits() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		int count =0;
		while(num>0) {
			num = num/10;
			count++;
		}
		
		System.out.println("total number of digits = " + count);
	}
	
//	@Test
	public void numberOfEvenOddDigits() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();			//1234
		int countEven=0, countOdd=0;
		
		if(num!=0) {
			
			while(num>0) {
				int lastDigit = num % 10;
				
				if(lastDigit%2==0) {
					countEven++;
				}else
					countOdd++;
				
				num = num/10;
			}
			
			
		}else
			System.out.println("number is zero");
	}
	
	@Test
	public void EvenAndDigits( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();		
		int countEven =0 , countOdd = 0;
		// first we need to find out how many even and odd digits are there
		int copyNum = num;
		if(num!=0) {
			
			while(num>0) {
				
				int lastDigit = num%10;
				
				if(lastDigit%2==0) {
				//	System.out.println("even = " + lastDigit); // also work
					countEven++;
				}else {
					//System.out.println("odd = " + lastDigit); //also work
					countOdd++;	
				}
				num = num/10;
			}
			// now as we know the size of even and odd digits
		int even[] = new int[countEven];
		int odd[] = new int[countOdd];
		int x=0, y= 0;
		for(int i =0; i<countEven+countOdd; i++) {
			
			while(copyNum>0) {
				
				int lastD = copyNum %10;
				
				if(lastD%2==0) {
					even[x] = lastD;
					x++;
				}else {
					odd[y] = lastD;
					y++;
				}
				copyNum = copyNum/10;
			}
		}
		System.out.println();
		System.out.println("even elements in the numbers = ");
		for(int J:even) {
			System.out.print(J + " ");
		}
		System.out.println();System.out.println("number of odd elements =");
		for(int J:odd) {
			System.out.print(J + " ");
		}
			
		}else
			System.out.println("number is 0");
	}
}
