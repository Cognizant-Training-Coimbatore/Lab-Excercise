package demo;

import java.util.Scanner;

public class adsub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value 1");
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		System.out.println("enter value 2");
		int y=in.nextInt();
		Op o=new Op(x, y);
		System.out.println("sum is"+o.add());
		System.out.println("difference is"+o.sub());
		System.out.println("product is"+o.mul());
		System.out.println("qoutient is"+o.div());
	}

}
class Op{
	int x,y;
	  Op(int val1,int val2) {
		x=val1;
		y=val2;
	}
	int add() {
		return x+y;
	}
	int sub() {
		return x-y;
	}
	int mul() {
		return x*y;
	}
	double div() {
		return x/y;
	}
}
