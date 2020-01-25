import java.util.Scanner;

class student123
		{
			String name, add;
			String phn;
			int roll_no;
			
			void getData()
			{
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter student name");
				name = scanner.nextLine();
				System.out.println("Enter roll number");
				roll_no = scanner.nextInt();
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Enter phone number");
				phn = scanner1.nextLine();
				System.out.println("Enter address");
				add = scanner1.nextLine();
			}
			void putData()
			{
				System.out.println("Name : " +name+ "Roll number : " +roll_no+ "Phone number : " +phn+ "Address : " +add);
			}
		}
public class two_students 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		student123 obj1 = new student123();
		obj1.getData();
		obj1.putData();
		
		student123 obj2 = new student123();
		obj2.getData();
		obj2.putData();
		
	}

}