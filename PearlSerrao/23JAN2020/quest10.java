package demo;

import java.util.Scanner;

class Area_square_Rect{
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
public class quest10 {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a,x,y;
	System.out.println("Enter square side, length,breadth of a rectangle");
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	x=input.nextInt();
	y=input.nextInt();
	Area_square_Rect obj=new Area_square_Rect();
	obj.square(a);
	obj.rectangle(x, y);
	
	

}

}

