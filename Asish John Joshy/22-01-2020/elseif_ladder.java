package demo;

public class nested_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=95;
		if(marks>90 &&marks<101)
		{
			System.out.println("Grade: A");
		}
		else if(marks>80 &&marks<91)
		{
			System.out.println("Grade: B");
		}
		else if(marks>70 &&marks<81)
		{
			System.out.println("Grade: C");
		}
		else
		{
			System.out.println("Grade: D");
		}
	}

}
