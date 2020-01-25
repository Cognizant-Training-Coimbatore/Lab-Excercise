import java.util.Scanner;

public class Exer2_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int sum=0,min=0,max=0,x;
		for(int i=0;i<10;i++)
		{
			System.out.print((i+1)+" number: ");
			x=scan.nextInt();
			sum+=x;
			if(i==0) {
				min=x;
			}
			else if(min>x)
				min=x;
			if(i==0) {
				max=x;
			}
			else if(max<x)
				max=x;
		}
		System.out.println("\nMinimum: "+min+"\nMaximum: "+max);
		System.out.println("Average: "+sum/10);
	}
	
}
