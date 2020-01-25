import java.util.Scanner;

public class ExerProg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x,y,u;
		System.out.print("Enter old meter reading: ");
		x=scan.nextInt();
		System.out.print("Enter new meter reading: ");
		y=scan.nextInt();
		u=y-x;
		if(u<=100)
			System.out.print("Your Electricity bill is Nil.");
		else if(u<=200) 
			System.out.print("Your Electricity bill is: Rs."+u);
		else if(u<=300) 
			System.out.print("Your Electricity bill is: Rs."+u*2);
		else if(u<=400) 
			System.out.print("Your Electricity bill is: Rs."+u*3);
		else if(u<=500) {
			u*=4;
			int temp=u/10;
			u+=temp;
			System.out.print("Your Electricity bill is: Rs."+u);
		}
		
	}

}
