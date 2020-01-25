import java.util.Scanner;

class area
{
	int area(int l,int b)
	{
		int a;
		a = l*b;
		return a;
		
	}
}
public class program24_area_of_rectangle {

	public static void main(String[] args) 
	{
		area a1 = new area();
		System.out.println("Enter the Length of the rectangle");
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		System.out.println("Enter the Breadth of the rectangle");
		
		int b = scanner.nextInt();
		area a = new area();
		int ar = a.area(l, b);
		System.out.println("Area : "+ar);
		
		
		
		
		
	}

}
