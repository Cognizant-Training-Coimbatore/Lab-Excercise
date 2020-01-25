import java.util.Scanner;

public class pg4positiveornot {

	public static void main(String[] args) {
		int x;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		if(x>0)
		
			System.out.println(x+" is postive");
			
		else
		System.out.println(x+" is not positive");
	}

}
