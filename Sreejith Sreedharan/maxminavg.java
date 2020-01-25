package demo;

import java.util.Scanner;

public class maxminavg {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(int i=0;i<arr.length;i++)
			{arr[i]=sc.nextInt();
			sum+=arr[i];
			}
		int c;
		int n;
		n=arr.length;
		for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                     c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                }
		System.out.println("minimum number is"+" "+arr[0]);
		System.out.println("maximum value is"+" "+arr[9]);
		System.out.println("avg is"+" "+sum/10);
		
		
	}

}
