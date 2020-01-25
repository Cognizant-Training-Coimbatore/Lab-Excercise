import java.util.Scanner;

public class Exer2_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String x = scan.next();
		int l = x.length(),fl=0;
		char[] ch= x.toCharArray();
		for(int i=0;i<l/2;i++)
		{
			if(ch[i]!=ch[l-1-i]) {
				fl=1;
			}
		}
		if(fl==0)
			System.out.println("It is a palindrome!!");
		else
			System.out.println("It's not a plaindrome!");
	}

}
