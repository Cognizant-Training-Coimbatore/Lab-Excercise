import java.util.Scanner;

public class Exer5_Prog1 {
	static void validate(int x) throws except{
		if(x<0)
			throw new except(x);
		else {
			System.out.println("validated");
		}
	}
	public static void main(String[] args) throws except{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		try {
			validate(x);
		} catch (Exception e) {
			// TODO: handle exception
		}
		scan.close();
	}

}
