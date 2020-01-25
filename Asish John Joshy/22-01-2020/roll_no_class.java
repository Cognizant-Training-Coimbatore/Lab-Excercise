package demo;

import java.util.Scanner;

class student
{
	int roll_no;
	String name,add;
}
public class roll_no_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		student stu1=new student();
		student stu2=new student();
		System.out.println("Enter the first name");
		stu1.name=s.nextLine();
		System.out.println("Enter roll number");
		stu1.roll_no=s.nextInt();
		System.out.println("Enter the first address");
		stu1.add=s.nextLine();
		System.out.println("Enter the second name");
		stu2.name=s.nextLine();
		System.out.println("Enter roll number");
		stu2.roll_no=s.nextInt();
		System.out.println("Enter the second address");
		stu2.add=s.nextLine();
		System.out.println("Details of first student\nName:"+stu1.name+"\nRoll no:"+stu1.roll_no+"\nAddress:"+stu1.add);
		System.out.println("Details of second student\nName:"+stu2.name+"\nRoll no:"+stu2.roll_no+"\nAddress:"+stu2.add);
	}

}
