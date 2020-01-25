import java.util.Scanner;

public class Program_17_electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value of new meter");
		int x=scan.nextInt();
		System.out.println("enter value of old meter");
		int y=scan.nextInt();
		val=x-y;
		if(val>0 && val<101)
		{
			System.out.println("price=Free");
		}
		else if(val>100 && val<201)
		{
			System.out.println("price=1");
		}
		else if(val>200 && val<301)
		{
			System.out.println("price=2");
		}
		else if(val>300 && val<401)
		{
			System.out.println("price=3");
		}
		else
			
		{
			System.out.println("price=4+tax 10%");
		}
	}

}
