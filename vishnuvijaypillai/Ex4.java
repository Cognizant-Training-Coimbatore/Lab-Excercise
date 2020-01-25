import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count=0 ;
		int[] x = new int[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("i am thinking of a number btween 0to9 can u guess it");
		for (i=0;i<2;i++)
		{
			x[i] = scanner.nextInt();
			if(x[i]==9)
			{
				System.out.println("you are right");
				break;
			}
			else
			{
				System.out.println("wrong ans, i am thinking of a number btween 0 to 9 guess the number ");
                count++;
			}
		}
		if (count>0)
		{
			x[2] = scanner.nextInt();
			if(x[2]==9)
			{
				System.out.println("you guessed it ");
			}
			else
			{
				System.out.println("wrong ans, the number was 9");
				
			}
		}
	}

}
