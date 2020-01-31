import java.util.Scanner;

public class EX_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x =scanner.nextInt();
		double area = (6*x*x)/(4*(Math.tan(3.14/6)));
		System.out.println("area = " +area);
		

	}

}