import java.util.Scanner;

public class ques_11 {

	
	static int powerof(int a1)
	{
		int a=a1;
		while(a>1)
		{
			if(a%4!=0)
			{
				return 0;
			}
			a=a/4;
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(powerof(n)==1)
		{
			System.out.println("is power of");
		}
		else
		{
			System.out.println("not a power of");
		}
	}
}
	