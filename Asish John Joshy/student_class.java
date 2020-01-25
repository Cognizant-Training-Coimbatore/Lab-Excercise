package demo;

import java.util.Scanner;

class Student
{
	String name;
	int roll_no;
}
public class student_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter the name");
		st.name=s.nextLine();
		System.out.println("\nEnter the roll number");
		st.roll_no=s.nextInt();
		System.out.println("\nName:"+st.name+"\nRoll no:"+st.roll_no);
	}

}
