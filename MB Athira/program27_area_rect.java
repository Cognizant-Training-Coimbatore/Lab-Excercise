import java.util.Scanner;

class area
{
	int area(int l, int b)
	{
		int a;
		a = l*b;
		return a;
	}
}
public class program27_area_rect {

	public static void main(String[] args) 
	{
		System.out.println("Enter the length and breadth in respective order :");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		area a = new area();
		int ar = a.area(x, y);
		System.out.println("Area : "+ar);

	}

}
