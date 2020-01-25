package demo;

import java.util.Scanner;

class swap
{
void change(int n,String l)
{System.out.println(n);
System.out.println(l);
	}
void change(String l,int n)
{System.out.println(l);
System.out.println(n);


}
}
public class order {

	public static void main(String[] args) {
		swap obj=new swap();
		Scanner sc=new Scanner(System.in);
		
		int k;
		
		String l;
		System.out.println("enter string");
		l=sc.nextLine();
		System.out.println("enter number");
		k=sc.nextInt();
		
		obj.change(k, l);
		obj.change(l, k);}

}
