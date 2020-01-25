import java.util.Scanner;
public class day2_ques5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int a=sc.nextInt();
		int i,j;
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		

	}

}
