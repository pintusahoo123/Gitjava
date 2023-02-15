package qedge.dec6;

public class Equal_and_equalignorecase_string {
	public static void main(String[] args) {
		String x1="ilovechess";
		String x2="Ilovechess";
		String x3="ilovechess";
		System.out.println(x1.equals(x2)); //because it looks for case sensitive
		System.out.println(x1.equals(x3));
		System.out.println(x1.equalsIgnoreCase(x2));
		
		
	
	}

}
