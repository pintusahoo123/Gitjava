package qedge.dec2;

public class Else_if_or_nested_if_condition {

	public static void main(String[] args) {
		//verify given marks is true or false
		int marks=70;
		if (marks>=80)
		{
			System.out.println("student passed "+marks);
		}
		else if(marks>=60)
		{
			System.out.println("student passed "+marks);
		}
		else
		{
			System.out.println("student failed "+marks);
		}

	}


}


