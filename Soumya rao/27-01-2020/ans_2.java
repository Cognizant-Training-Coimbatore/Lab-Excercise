import java.util.Scanner;
public class ans_2 {

	public static void main(String[] args) {
		try
		{
			int number1,number2;
			Scanner sc=new Scanner(System.in);
			number1=sc.nextInt();
			number2 =sc.nextInt();
		int	c=number1/number2;
			System.out.println("result is   "+c);
			}
		catch(ArithmeticException e) 
			
			{
				System.out.println("devide by zero error");
			}
		}
	}


