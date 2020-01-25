import java.util.Scanner;
public class Program12_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi=3.14;
		int rad;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of radius");
		rad=scan.nextInt();
		double area=rad*rad*pi;
		System.out.println("area of circle: "+area);
		
	}

}
