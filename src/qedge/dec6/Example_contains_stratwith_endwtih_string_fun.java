package qedge.dec6;

public class Example_contains_stratwith_endwtih_string_fun {
	public static void main(String[] args) {
		String x= "iam learning corejava with selenium";
		String y= "selenium";
		System.out.println(x.contains(y));
		System.out.println(x.contains("iam"));
		System.out.println(x.contains("java"));
		System.out.println(y.contains("seium"));// because it is not in sequence manner
		System.out.println(x.startsWith("iam"));
		System.out.println(x.endsWith("selenium"));
	}

}
