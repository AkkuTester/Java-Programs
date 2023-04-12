package javaPrograms;

public class Conversions {

	public static void main(String[] args) {
		
		//CONVERSION OF CHAR ARRAY INTO THE STRING
		char arr[] = {'A', 'B','C', 'Z', 'X' };
		String str = new String(arr);
		System.out.println(str);

		//CONVERSION OF STRING INTO THE CHAR ARRAY
		String str1 = "welcome to automation";
		char arr1[] = str1.toCharArray();
		System.out.println(arr1);
		
		//CONVERSION OF NUMBERS FROM STRING INTO THE INT
		String str2 = "123456";
		int num = Integer.valueOf(str2);
		System.out.println(num);
		
		//CONVERSION OF CHARACTERS INTO THE STRING
		char c = 'c';
		String s = Character.toString(c);
		System.out.println(c);
		
		
	}

}
