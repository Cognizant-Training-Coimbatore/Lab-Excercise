import java.util.Scanner;

public class p7_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string: ");
		Scanner s = new Scanner(System.in);
		String a = s.next();
		System.out.print("Reversed string is: ");
		char[] ch = a.toCharArray();
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	}

}
