import java.util.Scanner;

public class p2_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of N[1-9]:");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("Multiplicatoin table upto N" +a+":");
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=a;j++)
			{
				System.out.print(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
