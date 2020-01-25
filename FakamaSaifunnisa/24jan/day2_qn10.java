import java.util.Scanner;

public class day2_qn10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();
		int n=b.length();
		char a[]=b.toCharArray();
		int s=0;
		for(int i=0;i<n-1;i++) {
			if(n%2!=0) {
				s=1;
				break;
			}
			if(a[i]!=a[n-1]) {
				s=1;
				break;
			}
			else
			{
				n=n-1;
			}
		}
		if(s==1)
		{
			System.out.println("not palindrome");
		}
		else
		{
			System.out.println("palindrome");
		}
		}

}
