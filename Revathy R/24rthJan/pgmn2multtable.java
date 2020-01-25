import java.util.Scanner;

public class pgmn2multtable {

	public static void main(String[] args) {
		int a;
		System.out.println("enter the numbers between 1 and 9\n");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<10;j++)
			{
				System.out.println(i+"*"+j+" = "+i*j);
			}
		}
	}

}
