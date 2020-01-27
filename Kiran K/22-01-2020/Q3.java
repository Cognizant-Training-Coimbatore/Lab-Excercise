import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi=3.14;
		double area;
		int r;
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius");
        r=scanner.nextInt();
        area=pi*(r^2);
        System.out.println("Area of the circle is:"+area);
        
	}

}
