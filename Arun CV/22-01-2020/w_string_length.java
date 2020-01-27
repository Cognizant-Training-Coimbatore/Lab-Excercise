import java.util.Scanner;

public class w_string_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		System.out.println("Enter the string");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextLine();
		int l = a.length();
		System.out.println("The length of the string is " +l);
	}

}
