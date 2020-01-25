import java.util.Scanner;

class area{
	int length,breadth;
	int returnarea(int length,int breadth)
	{
		int area;
		area=length*breadth;
		return area;
	}
}
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area obj=new area();
		Scanner input=new Scanner(System.in);
		obj.length=input.nextInt();
		obj.breadth=input.nextInt();
		System.out.println("area is:"+obj.returnarea(obj.length,obj.breadth));
		
	}

}
