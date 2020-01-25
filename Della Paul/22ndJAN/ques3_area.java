import java.util.Scanner;
class Area{

	  int area(int x,int y){
		int a;
		a=x*y;
		return a;
	}
	
}
public class ques3_area {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length");
		 int a1= s.nextInt();
		 System.out.println("enter the breadth");
		 int b1= s.nextInt();
		 Area a=new Area();
		 int ar=a.area(a1,b1);
		 System.out.println("area of rectangle is"+ar);
		 
		
		
	}

}
