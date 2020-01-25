import java.util.Scanner;

class operations
{
	float add(float a, float b)
	{
		return a+b;
	}
	float sub(float a, float b)
	{
		return a-b;
	}
	float mult(float a, float b)
	{
		return a*b;
	}
	float div(float a, float b)
	{
		return a/b;
	}
}

public class math_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operations obj= new operations();
		Scanner sc= new Scanner(System.in);
		float a,b;
		System.out.println("addition"+obj.add(a,b)+"subtraction"+obj.sub(a,b)+"multiplication"+obj.mult(a,b)+"division"+obj.div(a,b));
		
				

	}

}
