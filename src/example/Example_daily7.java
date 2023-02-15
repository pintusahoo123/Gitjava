package example;

public class Example_daily7 {
	public static void main(String[] args) {
		//to check product avialable in zomato or not
		String food ="pakoda";
		switch (food.toUpperCase())// it converts all lower cases to upper cases
		{
		case "BIRIYANI":
			System.out.println("food is available @ "+food);
			break;
		case "ROLL":
			System.out.println("food is avilable @ "+food);
			break;
		case "PAKODA":
			System.out.println("food is avilable @ "+food);
			break;
		case "KABAB":
			System.out.println("food is avilable @ "+food);
			break;
			default:
			System.out.println("food is not avilable @ "+food);
			
		}
		
	}

}
