package packB;

import java.util.Scanner;

public class qn_2 {
	static void div(int d,int e)throws Exception{
		if(e==0) {
			throw new myexceptions("the second number cant be zero");
		}
		else {
			double result=d/e;
			System.out.println("the result is: "+result);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			div(a,b);
		}
		catch(Exception m) {
			System.out.println("error occured "+m);
		}

	}

}
