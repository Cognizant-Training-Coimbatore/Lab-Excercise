import java.util.Scanner;

public class program19_electricitybill_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oldr,newr,units;
		System.out.println("Enter the old meter reading");
		Scanner sc=new Scanner(System.in);
		oldr=sc.nextInt();
		System.out.println("Enter the new reading");
		newr=sc.nextInt();
		units=newr-oldr;
		if(units>1 && units<101)
			System.out.println("Free");
		else if(units>100 && units<201)
			System.out.println("Price=Rs.1");
		else if(units>200 && units<301)
			System.out.println("Price=Rs.2");
		else if(units>300 && units<401)
			System.out.println("Price=Rs.3");
		else if(units>=400)
			System.out.println("Price="+(4+.1*units));
		
		
	}

}
