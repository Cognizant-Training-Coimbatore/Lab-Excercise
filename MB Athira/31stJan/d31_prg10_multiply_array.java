import java.util.Scanner;

public class d31_prg10_multiply_array
{

	public static void main(String[] args)
	{
		  Scanner sc=new Scanner(System.in);
		  int n[]=new int[4];
		  int p[]=new int[4];
		  int s[]=new int[4];
		  for (int i = 0; i < 4; i++)
		  {
			n[i]=sc.nextInt();
			p[i]=sc.nextInt();
		  }
		  for (int i = 0; i <4; i++)
		  {
			s[i]= n[i]*p[i];
		  }
		  System.out.println("Result:");
		  for (int j = 0; j < 4; j++) 
		  {
			System.out.println(p[j]+"*"+n[j]+"="+s[j]);
		  }
	}

}
