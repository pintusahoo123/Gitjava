package qedge.dec5;

public class For_twodimensional_formula2 {

	public static void main(String[] args) {
		//store login data into array
		String x[][]= {{"admin1","test1"},{"admin2","test2"},{"admin3","test3"},{"admin4","test4"}};
		System.out.println(x.length);    //print row length
		System.out.println(x[0].length);//print column length in 1st row
		System.out.println(x[2][0]);    //i want to print admin3
		for(int i=0;i<x.length;i++)      //iterate all rows
		{                               
		for(int j=0;j<x[i].length;j++)   // iterate all column in each row
		{
			System.out.print(x[i][j]+"\t");
		}
		System.out.println();
		}
		

	}
}


