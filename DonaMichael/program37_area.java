import java.util.Scanner;

class areas
{
	int l,b,s;
	areas(int x,int y)
	{
		l=x;
		b=y;
		System.out.println("Area of rectangle is"+(l*b));
	}
	areas(int m){
		s=m;
		System.out.println("Area of the square is "+(s*s));
	}
	}
public class program37_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth\n");
		int l1=sc.nextInt();
		int b1=sc.nextInt();
		System.out.println("Enter the sides of the square:\n");
		int s1=sc.nextInt();
		areas obj=new areas(l1,b1);
		areas obj1=new areas(s1);
		
	}

}
