import java.util.Scanner;

class area6{
	int returnArea(int l, int b)
	{
		return l*b;
	}
}
public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int l,b;
      System.out.println("enter length and breadth");
      l= sc.nextInt();
      b= sc.nextInt();
      area6 obj=new area6();
      System.out.println("area of rectangle "+obj.returnArea(l, b));
      
	}

}
