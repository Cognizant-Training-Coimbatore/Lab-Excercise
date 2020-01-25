import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the 2 numbers");
		int x,y;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		int i;
		for (i=x+1;i<y;i++)
		{
			System.out.println(i);
		}

	}

}
