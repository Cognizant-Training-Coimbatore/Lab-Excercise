import java.util.Scanner;

class student
{
	String name;
	int roll_no;
}

public class student_roll_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student name ");
		student obj = new student();
		obj.name = scanner.nextLine();
		System.out.println("Enter roll number ");
		obj.roll_no = scanner.nextInt();
		System.out.println("The student name is " +obj.name+ "and roll number is " +obj.roll_no);
	}

}
