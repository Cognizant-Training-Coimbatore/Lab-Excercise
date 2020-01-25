import java.util.Scanner;

public class q4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int i,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		for(i=0;i<5;i++) {
			a[i]=input.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum is :"+sum);
		System.out.println("Average:"+(sum/5));
		

	}

}
