import java.util.Scanner;

class area{
	int returnArea(int l,int b)
	{
		return l*b;
	}
}
public class rectangle_area {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int l,b;
		System.out.println("enter length and breadt");
		l= sc.nextInt();
		b= sc.nextInt();
		area obj=new area();
		System.out.println("area of rectangle"+obj.returnArea(l,b));
		

	}

}
