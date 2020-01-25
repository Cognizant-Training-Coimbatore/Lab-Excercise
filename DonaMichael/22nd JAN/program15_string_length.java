import java.util.Scanner;

public class program15_string_length {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println("The length of the string is:"+str.length());
	}

}
