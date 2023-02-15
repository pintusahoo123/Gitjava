package qedge.dec6;

public class Example_of_split_string {
	public static void main(String[] args) {
		String company="tcs,delloite,ibm,infosys,wipro,capgemini";
		String x []= company.split(",");
		System.out.println(x[3]);
		for (String each : x) 
		{
			System.out.println(each);
			
		}
	}

}
