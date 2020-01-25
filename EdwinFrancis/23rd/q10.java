import java.util.Scanner;

class area{
	int val;
	void square(int a) {
		val=a*a;
		System.out.println("Square:"+val);
	}
	void rectangle(int x,int y) {
		val=x*y;
		System.out.println("Rectangle:"+val);
	}
}
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,x,y;
		System.out.println("Enter square side, length,breadth of a rectangle");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		x=input.nextInt();
		y=input.nextInt();
		area obj=new area();
		obj.square(a);
		obj.rectangle(x, y);
		
		

	}

}
