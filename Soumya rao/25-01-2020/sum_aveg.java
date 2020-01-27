package protcted_2;

import java.util.Scanner;

public class sum_aveg {

	public static void main(String[] args) {
	int count,sum=0;int avg=0;
	Scanner scan = new Scanner(System.in);
    System.out.print("Enter number of elements you want in the array: ");
    count = scan.nextInt();

    int num[] = new int[count];
    System.out.println("Enter array elements:");
    for (int i = 0; i < count; i++) 
    {
        num[i] = scan.nextInt();
    }
    for(int i=0;i<count-1;i++)
    {
    	sum=sum+num[i];
    	}
    	avg=sum/count;


    System.out.println("the sum is  "+sum);
    System.out.println("the avg is  "+ avg);
    	
    }

	}


