package helloworld;

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a=new int[5];
		int count=0,i;
       System.out.println("Enter 5 numbers:");
       Scanner sc=new Scanner(System.in);
       a[0]=sc.nextInt();
       a[1]=sc.nextInt();
       a[2]=sc.nextInt();
       a[3]=sc.nextInt();
       a[4]=sc.nextInt();
       for(i=0;i<5;i++)
       {
    	   if(a[i]%2==1)
    	   {
    		   count++;
    	   }
       }
       System.out.println(count);
    	   
	}

}
