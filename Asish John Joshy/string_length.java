package demo;
import java.util.Scanner;

public class string_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string\n");
		a=s.nextLine();
		int l=a.length();
		System.out.println("String length="+l);
	}

}
