import java.util.Scanner;

class areas
{
	int l,b,s;
	areas(int x,int y)
	{
		l=x;
		b=y;
		System.out.println("area of rectangle is "+(l*b));
	}
	areas(int m)
	{
		s=m;
		System.out.println("area of square is "+(s*s));
	}
}
public class pgm10recswq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length and breadth\n");
		int l1=sc.nextInt();
		int b1=sc.nextInt();
		System.out.println("enter the sides of square\n");
		int s1=sc.nextInt();
		areas obj=new areas(l1,b1);
		areas obj1=new areas(s1);

	}

}
