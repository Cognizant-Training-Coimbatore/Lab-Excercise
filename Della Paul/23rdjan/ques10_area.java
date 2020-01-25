import java.util.Scanner;
class area
{
	 area(int x)
	{
		int y;
		y=x*x;
		System.out.println("Area of square is"+y);
	}
	 area(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println("Area of rectangle is"+c);
	}
}
public class ques10_area {

	public static void main(String[] args) {
		System.out.println("enter length and breadth");
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		int w=sc.nextInt();
		area a2=new area(z,w);
		System.out.println("enter the side of square");
		area a1=new area(z);
	

	}

}
