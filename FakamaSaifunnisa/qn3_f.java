import java.util.Scanner;

class Area{
	int area(int x,int y) {
		int a;
		a=x*y;
		return a;
	}
}
public class qn3_f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter length");
		int a1=s.nextInt();
		System.out.println("enter breadth");
		int a2=s.nextInt();
		Area a=new Area();
		int ar=a.area(a1, a2);
		System.out.println(ar);
		

	}

}
