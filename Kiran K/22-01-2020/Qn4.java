package demo;

import java.util.Scanner;

class calc{
int x,y;
int add(int x,int y) {
	int sum;
	sum=x+y;
	return sum;
}
int subtract(int x,int y) {
	int difference;
	difference=x-y;
	return difference;
}
int multiplication(int x,int y) {
	int product;
	product=x*y;
	return product;
}
int division(int x,int y) {
	int div;
	div=x/y;
	return div;
}
}
public class Qn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj=new calc();
		Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter the first no:");
		 obj.x=scanner.nextInt();
		 System.out.println("enter the second no:");
		 obj.y=scanner.nextInt();
		System.out.println("The sum is:"+obj.add(obj.x,obj.y));
		System.out.println("The difference is:"+obj.subtract(obj.x,obj.y));
		System.out.println("The product is:"+obj.multiplication(obj.x,obj.y));
		System.out.println("The qoutient is:"+obj.division(obj.x,obj.y));

	}

}
