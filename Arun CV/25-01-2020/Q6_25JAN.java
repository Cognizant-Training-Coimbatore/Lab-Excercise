package pckg;

import java.util.Scanner;

public class Q6_25JAN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] names=new int[5];
Scanner sc=new Scanner(System.in);		
for(int i=0;i<5;i++)
{
System.out.println("Enter the number :#"+i);
names[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<5;i++)
{
sum=sum+names[i];
}
int avg=sum/5;
System.out.println(sum);
System.out.println(avg);

}
}
