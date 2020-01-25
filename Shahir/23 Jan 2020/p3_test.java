import java.util.Scanner;

class Test
{
	int l,b;
	void returnArea()
	{
		System.out.println("Enter the length of rectangle: ");
		Scanner s1 = new Scanner(System.in);
		l=s1.nextInt();
		System.out.println("Enter the breadth of rectangle: ");
		Scanner s2 = new Scanner(System.in);
		b=s2.nextInt();
		System.out.println("Area of the rectangle="+l*b);
	}
}
public class p3_test
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.returnArea();
	}

}
