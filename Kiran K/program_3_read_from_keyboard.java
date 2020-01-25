package demo;

import java.util.Scanner;

public class program_3_read_from_keyboard {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter the value of x");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        System.out.println("The value of x is "+x);
	}

}
