import java.util.Scanner;

public class d31_prg16_rhombus_structure 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		int a = sc.nextInt();
		for (int i = 1; i < a+1; i++) 
		{
			for (int j2 = i; j2<a+1; j2++) 
			{
				System.out.print(" ");
			}
			for (int j1 = i; j1>0; j1--)
			{
				System.out.print(j1);
			}
			for (int j = 2; j <= i; j++) 
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		
		for (int i = a-1; i >0; i--) 
		{
			System.out.print("  ");
			for (int j3 = i ; j3<a-1; j3++) 
			{
				System.out.print(" ");
			}
			for (int j1 = i; j1>0; j1--)
			{
				System.out.print(j1);
			}
			for (int j = 2; j <= i; j++) 
			{
				System.out.print(j);
			}
			
			System.out.println("");
		}
	}

}
