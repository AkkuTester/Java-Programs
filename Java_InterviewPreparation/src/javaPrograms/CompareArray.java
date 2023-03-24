package javaPrograms;

public class CompareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int a[] = {10,36,36,50,78};
	int b[] = {10,36,36,50,7};
	
	//check the sizes first
	boolean flag = true;
	if(a.length == b.length) {
		
		for(int i=0; i<a.length; i++) {
		
		if(a[i] != b[i]) {
			flag = false;
		}
	}
	
		if(flag == true) {
			System.out.println("arrays are equals");
		}else
			System.out.println("Arrays are not equal");
		
	}else
		System.out.println("not equal because of size");
	
	
	
	}


}
