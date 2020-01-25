package demo;
import java.util.*;

public class program_5_sumandavg {

	public static void main(String[] args) {
		int a[]=new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
		{	a[i]=sc.nextInt();
		sum+=a[i];
				}
System.out.println("the sum is:"+sum);
System.out.println("the avg is:"+(sum/5));
	}

}
