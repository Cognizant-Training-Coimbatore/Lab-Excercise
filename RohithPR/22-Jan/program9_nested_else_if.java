
public class program9_nested_else_if {

	public static void main(String[] args) 
	{
		int marks = 95;
		if(marks > 90 && marks <101)
		{
			System.out.println("Grade A");
		}
		else if(marks > 80 && marks <91)
		{
			System.out.println("Grade B");
		}
		else if(marks > 70 && marks < 81)
		{
			System.out.println("Grade C");
		}
		else if(marks > 60 && marks < 71)
		{
			System.out.println("Grade D ");
		}
		else if(marks > 50 && marks < 61)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Fail");
		}
		}

	}


