package qedge.dec5;

public class For_twodimensional {

	public static void main(String[] args) {
		//store login data into array
		String y [][]= new String[3][2];
		y[0][0]= "admin1";
		y[0][1]= "test1";
		y[1][0]="admin2";
		y[1][1]= "test2";
		y[2][0]= "admin3";
		y[2][1]= "test3";
		//print row length
		System.out.println(y.length);
		//print column length in 1st row
		System.out.println(y[0].length);
		// i want to print password test2
		System.out.println(y[1][1]);
		//iterate all rows
		// for iterating all we use for or for each loop
		for (int i=0; i<y.length;i++)
		{
			//or iterating all column in each row
			for (int p=0;p<y[i].length;p++)
			{
				System.out.print(y[i][p]+"\t");
			}
			System.out.println();
	
		}
		

	}

}
