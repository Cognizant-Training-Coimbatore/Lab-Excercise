package packA;
import java.util.Scanner;

public class ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,number,small;
		System.out.println("Enter the maximum size");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int numbers1[]=new int[n];
		int i;
		System.out.println("Enter numbr 0");
		number=sc.nextInt();
		small=number;
		for(i=1;i<n;i++)
		{
			System.out.println("Enter number"+i);
			number=sc.nextInt();
			numbers1[i]=number;
			if(number<small)
			{
				small=number;
			}
		}
		
		System.out.println("smallest is"+small);
	}

}



