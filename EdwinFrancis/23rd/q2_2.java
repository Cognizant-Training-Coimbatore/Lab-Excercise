import java.util.Scanner;

public class q2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value b/w 1 to 9");
		n=input.nextInt();
		System.out.println("Multiplication table is:");
		for(i=1;i<10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}

	}

}
