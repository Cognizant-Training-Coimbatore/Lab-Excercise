package demo;
import java.util.*;

public class program_5_stringarraycaps {
	public static void main(String[] args) {
		String a[]=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 names");
		for(int i=0;i<5;i++)
			a[i]=sc.nextLine();	

	for(int j=0;j<5;j++)
	{System.out.println(a[j].toUpperCase());
	}
		
}
}