import java.util.Scanner;

public class w_ebill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of A");
		a = scanner.nextInt();
		if(a>1 && a<=100)
		{
			b=a+0;
			System.out.println("The bill is  " +b);
		}
		if(a>101 && a<=200)
		{
			b=a+1;
			System.out.println("The bill is  " +b);
		}
		if(a>201 && a<=300)
		{
			b=a+2;
			System.out.println("The bill is  " +b);
		}
		if(a>301 && a<=400)
		{
			b=a+3;
			System.out.println("The bill is  " +b);
		}
		if(a>401 && a<=500)
		{
			b=a+4;
			System.out.println("The bill is  " +b);
		}
	}

}
