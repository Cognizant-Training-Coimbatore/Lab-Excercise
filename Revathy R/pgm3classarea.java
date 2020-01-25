import java.util.Scanner;

class area
{
	int l,b;
	int returnArea(int m,int n) 
	{
		
		int area1=m*n;
		return area1;
	}
}
public class pgm3classarea {

	public static void main(String[] args) 
	{
		System.out.println("enter the value of length and breadth \n");
		Scanner sc=new Scanner(System.in);
		area obj=new area();
		obj.l=sc.nextInt();
		obj.b=sc.nextInt();
		int a1=obj.returnArea(obj.l,obj.b);
		System.out.println("area is "+a1);
		
		
	}

}
