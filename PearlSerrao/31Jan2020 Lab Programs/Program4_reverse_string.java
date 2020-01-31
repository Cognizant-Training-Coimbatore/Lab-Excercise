package selenium_proj;

import java.util.Scanner;

public class Program4_reverse_string {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub Scanner s = new Scanner(System.in);
		 * System.out.println("Enter  a string: "); char[] stringg =
		 * s.nextLine().toCharArray();
		 */
		String s="pearl";
		char[] rev=s.toCharArray();
        System.out.print("Reversed string: ");
        for (int i = rev.length- 1; i >= 0; i--) {
            System.out.print(rev[i]);
        }
        System.out.print("\n");
	}

}
