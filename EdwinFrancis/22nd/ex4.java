import java.util.Scanner;



public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter Number");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		if(num>0)
			System.out.println("positive");
		else
			System.out.println("negative or 0");
		

	}

}
