import java.util.Scanner;

public class area_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float pi=3.14f;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the radius");
		int r= sc.nextInt();
		float a= pi*r*r;
		System.out.println("area of circle" +a);
	}

}
