import java.util.Scanner;

public class program11_power_of_4 {
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
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(powerof(n)==1)
		{
			System.out.println("is power of 4");
		}
		else
		{
			System.out.println("not a power of 4");
		}

	}

}
