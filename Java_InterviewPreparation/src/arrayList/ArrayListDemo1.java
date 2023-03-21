package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * number of ways we can define the array list
		 */

		// by creating an object of arrayList
		ArrayList al = new ArrayList(); // to store all types of data
		
		//to store only integer type of data
		ArrayList<Integer> al_int = new ArrayList<Integer>();
		
		//to store string type of data
		ArrayList<String> al_string = new ArrayList<String>();
		
		// using parent interface
		List al_list = new ArrayList();
		
		/*
		 * to add elements into the array list
		 */
		
		al.add(101); al.add("smllacap_100"); al.add('Z'); al.add(100.300);al.add(true);
		
		/*
		 * print the array list
		 */
		System.out.println(al);//[101, smllacap_100, Z, 100.3, true]
		
		/*
		 * size of array list
		 */
		System.out.println(al.size()); //5
		
		/*
		 * remove an element using index
		 * suppose we wanted to remove an element from 1st index
		 */
		al.remove(1); //1 is an index
		System.out.println(al); //[101, Z, 100.3, true]
		
		/*
		 * remove an element using object directly
		 * suppose we wanted to remove true.
		 */
		al.remove(true);
		System.out.println(al); //[101, Z, 100.3]
		
		/*
		 * to isert an element at a specific location
		 */
		al.add(0,"volvo");
		System.out.println(al); //[volvo, 101, Z, 100.3]
		al.add("benz");
		System.out.println(al);//[volvo, 101, Z, 100.3, benz]
		
		/*
		 * to get/retrieve the specific element, pass the index number into the get method 
		 */
		System.out.println(al.get(2)); //Z
		
		/*
		 * to replace the specific value 		
		 */
		al.set(4, "Selenium");
		System.out.println(al); //[volvo, 101, Z, 100.3, Selenium]
		
		/*
		 * to search for the specific element
		 */
		System.out.println(al.contains("akkuma"));//false
		System.out.println(al.contains('Z'));//true
		
		/*
		 * empty
		 */
		System.out.println(al.isEmpty()); //false
		/*
		 *To read araylist data using for loop 
		 */
		System.out.println("array list using for loop:  ");
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		/*
		 * To read arrayblist data using for each loop
		 */
		System.out.println("array list using for each loop:  ");
		for(Object e:al) {
			System.out.println(e);
		}
		/*
		 * Iterator()
		 */
		System.out.println("using iterator(): ");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //printing element and move to next
		}
		
		
		
		
		
	}

}
