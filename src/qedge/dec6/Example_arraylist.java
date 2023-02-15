package qedge.dec6;

import java.util.ArrayList;

public class Example_arraylist {

	public static void main(String[] args) {
		ArrayList<String> mycars =new ArrayList<String>();// i want list my cars
		mycars.add("mercedes");
		mycars.add("audi");
		mycars.add("tata");
		mycars.add("skoda");
		mycars.add("toyota");
		mycars.add("ferrari");
		System.out.println(mycars.size()); // i want to print my size of collection
		System.out.println(mycars.get(3));  // i want to print 4th position of sokda value
		for (String each : mycars) {
			System.out.println(each);
			
		}
		

	}

}
