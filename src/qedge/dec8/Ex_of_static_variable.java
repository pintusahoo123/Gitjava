package qedge.dec8;

public class Ex_of_static_variable {
	// global static variable
	static int a,b,c;
	public static void multiplication() //method 
	{
		a=50;
		b=2;
		c=a*b;
		System.out.println(c);
	}
    public static void division() // method
    {
    	a=100;
    	b=25;
    	c=a/b;
    	System.out.println(c);
    			
    }
	public static void main(String[] args) {
		// calling static method with class name
		Ex_of_static_variable.multiplication();
		Ex_of_static_variable.division();
	
	}

}
