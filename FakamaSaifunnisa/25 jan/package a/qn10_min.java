package packA;
import java.util.*;
public class qn10_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,smaller;
		
		Scanner sc=new Scanner(System.in);
		int numbers1[]=new int[5];
		int i;
		System.out.println("Enter numbr 0");
		number=sc.nextInt();
		smaller=number;
		for(i=1;i<5;i++)
		{
		System.out.println("Enter number"+i);
		number=sc.nextInt();
		numbers1[i]=number;
		if(number<smaller)
		{
		smaller=number;
		}
		}
		System.out.println("smaller is"+smaller);
		}

	}
