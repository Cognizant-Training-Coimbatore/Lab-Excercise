package demo;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class Program15_greater_than_or_equal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> myset=new TreeSet<Integer>();
		myset.add(5);
		myset.add(10);
		myset.add(2);
		myset.add(4);
		myset.add(15);
		myset.add(14);
		myset.add(6);
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int x:myset)
		{
			if(x>a)
			{
				System.out.println(x);
				break;
			}
		}
		
	}
}
