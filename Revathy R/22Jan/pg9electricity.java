import java.util.Scanner;

public class pg9electricity {

	public static void main(String[] args) {
		int old,new1;
		System.out.println("enter the value of old meter reading");
		Scanner sc=new Scanner(System.in);
		old=sc.nextInt();
		System.out.println("enter the value of new meter reading");
		new1=sc.nextInt();
		int unit=new1-old;
		if(unit>=1 && unit<=100)
			System.out.println("price is free");
		else if(unit>=101 && unit<=200)
			System.out.println("price is Rs.1");
		else if(unit>=201 && unit<=300)
			System.out.println("price is Rs.2");
		else if(unit>=301 && unit<=400)
			System.out.println("price is Rs.3");
		else if(unit>=401)
			System.out.println("price is Rs."+(4+(.1*unit)));
	}

}
