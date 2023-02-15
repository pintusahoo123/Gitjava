package qedge.dec2;

public class Switch_case {

	public static void main(String[] args) {
		//CHECK AVAILABLE COURSE IN QEDGE
		String course ="AWs";
		switch (course.toUpperCase()) 
		{

		case"SELENIUM" :
			System.out.println("course is avilable:"+course);
			break;
		case"MANUAL" :
			System.out.println("course is available:"+course);
			break;
		case"PYTHON" :
			System.out.println("course is available:"+course);
			break;
		case"AWS":
			System.out.println("course is availavble: "+course);
			break;
		default:
			System.out.println("couse is not avialable:"+course);
			break;
		}

	}

}
