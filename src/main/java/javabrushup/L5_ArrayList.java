package javabrushup;

import java.util.ArrayList;

public class L5_ArrayList {

	public static void main(String[] args) {
		// Arraylist and its methods
		
		ArrayList<String> week = new ArrayList<String>();
		
		week.add("Monday");
		week.add("Tuesday");
		week.add("Wednesday");
		week.add("thursday");
		week.add("Friday");
		week.remove(2);
		
		System.out.println("List Contains Wednesday ="+" "+week.contains("Wednesday"));
		
		if((week.contains("Wednesday") != true))
				{
			System.out.println("Wednesday is removed");
				}

		//For loop for an arraylist or list
		
		for (String w : week) {
			
			System.out.println(w);
			
		}
		
		System.out.println("week[2] now contains ="+" "+week.get(2));
	}

}
