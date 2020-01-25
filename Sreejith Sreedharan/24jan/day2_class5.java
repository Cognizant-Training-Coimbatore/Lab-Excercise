package demo;

	import java.util.Scanner;
	public class day2_class5 {
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the range");
	  int a=sc.nextInt();
	  int i,j;
	  for(i=1;i<=a;i++)
	  {
	   for(j=1;j<=i;j++)
	   {
	    System.out.print(j);
	   }
	   System.out.println("");
	  }
	 }
	}

