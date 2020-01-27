package demo;

import java.util.Scanner;

public class program8_nested_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int marks;
        System.out.println("Enter marks");
        Scanner scanner=new Scanner(System.in);
        marks=scanner.nextInt();
        if(marks>90 && marks<101)
        {
        	System.out.println("Grade A");
        }
        else if(marks>80 && marks<=90)
        {
        	System.out.println("Grade B");
        }
        else if(marks>70 && marks<=80)
        {
        	System.out.println("Grade C");
        }
	}

}
