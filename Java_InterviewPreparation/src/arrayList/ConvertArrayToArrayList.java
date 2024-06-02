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

	public void convert_SetToArrayList(){
		// infogain question:  add 3 string in set and 1st string from that set
		
		Set<String> journeys = new HashSet<>();
		journeys.add("login");                  
		journeys.add("ForgotPassword"); 
		journeys.add("ResetPassword");  
		journeys.add("Create Folders");
	
		System.out.println(journeys);
		ArrayList<String> list = new ArrayList<>(journeys);
		
		System.out.println("ArrayList:  " + list);
		System.out.println(list.get(1));          //  retrieve desired string
	}
	
}
