import java.util.Scanner;
public class ans_8 {
		static void validate(int x)throws myexceptions
		{
				if(x<0)
					throw new myexceptions("this is invalid");
				else
					System.out.println("this is valid");
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int x;
				System.out.println("check whether the marks entered is valid");
				Scanner scanner =new Scanner(System.in);
				x = scanner.nextInt();
				try
				{
					validate(10);
				}
				catch(Exception m)
				{
					System.out.println("Exception occured:" +m);
				}

		}

	}
