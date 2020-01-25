package demo;

import java.util.Scanner;

class exchange
{
	exchange(int n,char c)
	{
		System.out.println("Integer="+n+"\nCharacter="+c);
	}
	exchange(char c,int n)
	{
		System.out.println("\nCharacter="+c+"\nInteger="+n);
	}
}
public class constructor_charint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an integer and a character");
		int n1=s.nextInt();
		char c1=s.next().charAt(0);
		exchange e1=new exchange(n1,c1);
		exchange e2=new exchange(c1,n1);
		
	}

}
