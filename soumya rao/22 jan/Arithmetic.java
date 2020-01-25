package demo;
import java.util.Scanner;
class Add(int a,int b) {

	return a+b;
}
class sub(int a,int b){
	return a-b;
}
class mul(int a,int b){
	return a*b;
}
class div(int a,int b){
	return a/b;
}
public static void main(String[] arg)
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
Add r1=new Add();
sub r2=new sub();
mul r3=new mul();
div r4=new div();
r1.add(a,b);
r1.sub(a,b);
r1.mul(a,b);
r1.div(a,b);
System.out.println("Addition of two numbers is : "+r1.c);
System.out.println("Substraction of two numbers is : "+r2.c);
System.out.println("Multiplication of two numbers is : "+r3.c);
System.out.println("Division of two numbers is : "+r4.c);
}
}
		