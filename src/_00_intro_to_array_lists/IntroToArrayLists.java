package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList <String> animals = new ArrayList <String> ();
		//2. Add five Strings to your list
		animals.add("ape");
		animals.add("cheetah");
		animals.add("lion");
		animals.add("elephant");
		animals.add("sloth");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < animals.size (); i ++) {
			String s = animals.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for (String s: animals) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
