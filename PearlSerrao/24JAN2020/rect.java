package demo;

import java.util.Scanner;

public class rect {
	public static void main(String[] args) {
		
	
		System.out.println("enter length");
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		System.out.println("enter breadth");
		int b=in.nextInt();
		Areas a=new Areas(l,b);
		System.out.println(a.returnArea());
	}

}
class Areas{
	int length,breadth;
	public  Areas(int l, int b) {
		length=l;
		breadth=b;
		
		
	}
	int returnArea() {
		return length*breadth;
	}
}
