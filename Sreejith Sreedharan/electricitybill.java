package demo;

import java.util.Scanner;

public class electricitybill {
	public static void main(String[] args) {
int oldbill,newbill;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the old amount and new amount");
oldbill=sc.nextInt();
newbill=sc.nextInt();
int units;
units=newbill-oldbill;
if(newbill<oldbill)
	System.out.println("invalid data");
else if(units>1&&units<101)
	System.out.println("price is free");
else if(units>100&&units<201)
	System.out.println("price is Rs.1");
else if(units>200&&units<301)
	System.out.println("price is Rs.2");
else if(units>300&&units<401)
	System.out.println("price is Rs.3");
else if(units>400)
System.out.println("price is "+(4+(.1*units)));
}
}
