import java.util.Scanner;

class numbers
{
	void series(int a, int b)
	{
	int i;
	for(i=a; i<=b; i++)
	{
		System.out.println("The numbers are " +i);
	}
	}
}
public class input_two_integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x, y;
		x = scanner.nextInt();
		y = scanner.nextInt();
		numbers obj =new numbers();
		obj.series(x,y);
	}

}
