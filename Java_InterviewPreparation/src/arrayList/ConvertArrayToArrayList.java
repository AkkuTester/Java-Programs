package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		String []arr = {"Dobby", "Simba", "Tiger", "Johny"};
		for(String v : arr) {
			System.out.println(v);
		}
		
		// To convert Normal array to arrayList
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
	}

}
