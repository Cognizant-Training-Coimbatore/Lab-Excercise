import java.util.Scanner;

public class Program16_count_odd_numberss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value of x");
		int x=scan.nextInt();
		System.out.println("enter value of y");
		int y=scan.nextInt();
		System.out.println("enter value of z");
		int z=scan.nextInt();
		System.out.println("enter value of u");
		int u=scan.nextInt();
		System.out.println("enter value of v");
		int v=scan.nextInt();
		if((x%2)!=0)
		{
			count=count+1;
		}
		if((y%2)!=0)
		{
			count=count+1;
		}
		if((z%2)!=0)
		{
			count=count+1;
		}
		if((u%2)!=0)
		{
			count=count+1;
		}
		if((v%2)!=0)
		{
			count=count+1;
		}
		
		System.out.println("count is "+count);

	}

}
