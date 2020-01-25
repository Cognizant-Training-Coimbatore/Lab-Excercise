import java.util.Scanner;

class area{
	int a;
	area(int x){
		a=x*x;
		System.out.println(a);
	}
	area(int x,int y)
	{
		a=x*y;
		System.out.println(a);
	}
}
public class area_rec_sqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length and breadth of rectangle");
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int z=sc.nextInt();
		area a1=new area(w,z);
		System.out.println("enter the side value of square");
		int q=sc.nextInt();
		area a2=new area(q);

	}

}
