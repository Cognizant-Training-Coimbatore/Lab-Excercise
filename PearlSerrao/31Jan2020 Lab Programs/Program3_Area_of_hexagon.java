package selenium_proj;
import java.lang.Math;
public class Program3_Area_of_hexagon {
	public static void main(String[] args) {
		float pi=(float) 3.14;
		int s=5;
		System.out.println("Area of Hexagon:");
		double area=((6*s^2)/(4*Math.tan((pi)/6)));
				System.out.println(area);
	}
}
