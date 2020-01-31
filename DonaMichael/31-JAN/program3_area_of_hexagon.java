import java.util.Scanner;

public class program3_area_of_hexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side length of hexagon");
		int s=sc.nextInt();
		double c=(6*s*s)/(4*(1/(1.73)));
		System.out.println("Area of hexagon is: "+c);
	}

	
	}


