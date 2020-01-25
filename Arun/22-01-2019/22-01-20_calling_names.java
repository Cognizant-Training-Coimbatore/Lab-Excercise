import java.util.Scanner;

class arun1
{
	String b;
	void arun1()
	{
				System.out.println("Name : " +b);
	}
	void arun1(String a)
	{
		System.out.println("Unknown");
	}
}
public class calling_names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String abc;
		System.out.println("Enter the value");
		abc = scanner.nextLine();
		arun1 obj = new arun1();
		obj.arun1();
		obj.arun1("g");
		
	}

}
