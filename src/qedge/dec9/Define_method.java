package qedge.dec9;

public class Define_method {
	public static void  addition(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	// i want to add string type data
	public static String verify_String(String str1,String str2) // here verify string is method
	
	{
		String res="";
		if (str1.equals(str2))
		{
			res="strings are equal";			
		}
		else
		{
			res= "strings are not equal";
			
		}
		return res;
		
	}
	// i want to add boolean type of data 
	public static boolean compare_values(int a, int  p)
	{
		if (a==p)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Define_method.addition(100, 200);
		String results=Define_method.verify_String("pintu","pintu");
		System.out.println(results);
		boolean x= Define_method.compare_values(1000, 2000);
		System.out.println(x);

	}

}
