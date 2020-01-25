import java.util.Scanner;
public class day2_ques2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no between 1 and 9");
		int x=sc.nextInt();
		int i,j,m;
		for(i=1;i<=x;i++)
		{
			for(j=1;j<=10;j++)
			{
				m=j*i;
				System.out.println(+j+"*"+i+ "="+m);
			}
			
		}
		
		
	}

}
