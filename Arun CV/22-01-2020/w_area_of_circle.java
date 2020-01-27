import java.util.Scanner;

public class w_area_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, r, pie = (float) 3.14;
		{
			System.out.println("Enter the value of radius");
			Scanner scanner = new Scanner(System.in);
			r = scanner.nextInt();
			a = (pie*r*r);
			System.out.println("The area of circle is " +a);
		}
	}

}
