import java.util.Scanner;

class area
{
	int returnArea(int l, int b)
	{
		return(l*b);
	}
}
public class rect_area 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the length of the rectangle");
		System.out.println("Enter the width of the rectangle");
		int x,y ;
		x=scanner.nextInt();
		y=scanner.nextInt();
		area obj = new area ();
		int a = obj.returnArea(x,y);
		System.out.println("Area="+a);
	}
}



