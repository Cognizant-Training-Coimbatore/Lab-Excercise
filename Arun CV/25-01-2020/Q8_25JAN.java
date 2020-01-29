package pckg;

import java.util.Arrays;
import java.util.Scanner;

public class Q8_25JAN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] names=new int[5];
		Scanner sc=new Scanner(System.in);		
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter the number :#"+i);
		names[i]=sc.nextInt();
		}
        Arrays.sort(names);
		System.out.printf("Ascending order : %s", 
                Arrays.toString(names)); 
		System.out.printf("\nDescending order :");
		for(int i=4;i>=0;i--)
		{
		System.out.print(names[i]);
		
		}
		 
		
	}
}
