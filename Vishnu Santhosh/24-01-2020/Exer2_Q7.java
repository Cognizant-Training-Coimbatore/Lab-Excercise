import java.util.Scanner;

public class Exer2_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String x = scan.next();
		System.out.print("Reversed string is: ");
		char[] ch= x.toCharArray();
		for(int i=x.length()-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
	}

}
