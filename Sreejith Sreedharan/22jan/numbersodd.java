package demo;

import java.util.Scanner;

public class numbersodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,d,e;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
int f=0;
if(a%2!=0)
	f++;
if(b%2!=0)
	f++;
if(c%2!=0)
	f++;
if(d%2!=0)
	f++;
if(e%2!=0)
	f++;
System.out.println("the number of odd numbers is  "+f);

	}

}
