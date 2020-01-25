import java.util.Scanner;

class Area{
	int returnArea(int l,int b) {
		return l*b;
	}
}
public class Exer_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int l = scan.nextInt();
		System.out.print("Enter the breadth: ");
		int b = scan.nextInt();
		Area obj = new Area();
		System.out.println("Area= "+obj.returnArea(l,b));
	}

}
