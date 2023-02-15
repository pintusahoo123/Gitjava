package qedge.dec5;

public class For_singledimension_formula1 {
	public static void main(String[] args) {
		//store integer values into array in single dimension
		int x[]= new int[8];
		x[0]=200;
		x[1]=350;
		x[2]=400;
		x[3]=500;
		x[4]=550;
		x[5]=600;
		x[6]=650;
		x[7]=700;
		//print length of array
		System.out.println(x.length);
		//print 400 in array
		System.out.println(x[2]);
		//use for each loop for print every value
		for (int each: x) {
			System.out.println(each);
			
		}
		
	}

}
