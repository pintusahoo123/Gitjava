package qedge.dec8;

public class Ex_non_static_variable {
	// non static global variable
	int a,b,c;
	public void addition()//method
	{
		a=10;
		b=15;
		c=a+b;
		System.out.println(c);
	}
	public void substraction() //method
	{
		a=50;
		b=10;
		c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		//creating reference  object for non  static method
		Ex_non_static_variable obj =new Ex_non_static_variable();
	    obj.addition();
	    obj.substraction();
	}

}
