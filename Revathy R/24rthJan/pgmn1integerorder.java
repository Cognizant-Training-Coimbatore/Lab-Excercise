import java.util.Scanner;

public class pgmn1integerorder {

	public static void main(String[] args) {
	int a,b;
	System.out.println("enter the two numbers\n");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	if(a<b)
	{
		for(int i=a+1;i<b;i++)
			System.out.println(i);
	}
	else
	{
		for(int i=a-1;i>b;i--)
			System.out.println(i);
	}

	}

}
