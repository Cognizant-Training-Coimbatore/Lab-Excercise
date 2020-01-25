package demo;

import java.util.Scanner;

public class program10_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpublic static void main(String[] args) 
			// TODO Auto-generated method stub
	          int marks;
	          System.out.println("Enter marks");
	          Scanner scanner=new Scanner(System.in);
	          marks=scanner.nextInt();
	          if(marks>90 && marks<101)
	          {
	        	  System.out.println("Grade A");
	          }
	          else if(marks>80 && marks<91)
	          {
	      		System.out.println("Grade B");
	          }
	          else if(marks >70 && marks <81)
	          {
	      		System.out.println("Grade C");
	          }
	          else if(marks >60 && marks <71)
	          {
	      		System.out.println("Grade D");
	          }
	          else if(marks >50 && marks <61)
	          {
	      		System.out.println("Grade E");
	          }
		}


}
