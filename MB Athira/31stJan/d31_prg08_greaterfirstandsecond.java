import java.util.Scanner;

public class d31_prg08_greaterfirstandsecond 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter three no.s");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		boolean a =((n3>n2)&&(n2>n1));
		if(a==true)
			System.out.println(a);
		else
			System.out.println(a);	
			
	}

}
