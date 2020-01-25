import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		int n=sc.nextInt();
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
