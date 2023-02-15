package qedge.dec5;

public class For_singledimension_formula2 {
	public static void main(String[] args) {
		//store string type data in array
		String week[]= {"sunday","monday","tuesday","wednessday","thursday","friday","saturday"};
		System.out.println(week.length);//print length of array
		System.out.println(week[3]);//print 3rd position value from array collection
		for (String each: week) {   //print each value of array collection
			System.out.println(each);
			
		}
	}

}
