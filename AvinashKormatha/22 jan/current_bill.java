import java.util.Scanner;

public class current_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter old meter reading");
		int old= sc.nextInt();
		System.out.println("enter new meter reading");
		int new1= sc.nextInt();
		int units= new1-old;
		if(units>=1 && units<=100)
		{
			System.out.println("Free");
		}
		else if(units>=101 && units<=200)
		{
			System.out.println(units*2);
		}
		else if(units>=201 && units<=300)
		{
			System.out.println(units*3);
		}
		else if(units>=301 && units<=400)
		{
			System.out.println(units*4 + 0.1*units);
		}
		else if(units>=401)
		{
			System.out.println(units*4 + 0.1*units);
		}
		else
		{
			System.out.println("aa");
		}

	}

}
