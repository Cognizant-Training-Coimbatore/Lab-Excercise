import java.util.Scanner;

public class program15_string_input {

	public static void main(String[] args) 
	{
		String s;
		int x;
		System.out.println("Enter the string");
		Scanner scanner = new Scanner(System.in);
		s = scanner.nextLine();
		System.out.println(s.length());
	}

}
