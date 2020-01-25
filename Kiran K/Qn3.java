package demo;

import java.util.Scanner;

class Area{
	int length,breadth;
int returnArea(int length,int breadth) {
	int area;
	area=length*breadth;
	return area;
}
}
public class Qn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Area obj=new Area();
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter the length");
		 obj.length=scanner.nextInt();
		 System.out.println("enter the breadth");
		 obj.breadth=scanner.nextInt();
		 System.out.println("The area is:"+obj.returnArea(obj.length,obj.breadth));
	}

}
