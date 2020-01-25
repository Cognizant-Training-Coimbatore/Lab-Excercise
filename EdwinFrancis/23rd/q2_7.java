import java.util.Scanner;

public class q2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		int i;
		System.out.println("Enter string:");
		Scanner input=new Scanner(System.in);
		str1=input.nextLine();
		System.out.println("Reverse String is:");
		for(i=str1.length();i>0;i--) {
			System.out.print(str1.charAt(i));
			
		}

	}

}
