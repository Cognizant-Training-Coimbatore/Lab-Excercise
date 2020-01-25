import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the numbers");
		int x , i;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		for(i=1;i<=x;i++)
		{
			System.out.println(x+"*"+i+"="+(x*i));
		}
	}

}
