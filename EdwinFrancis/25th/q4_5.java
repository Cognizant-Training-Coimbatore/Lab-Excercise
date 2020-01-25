import java.util.Scanner;

public class q4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]=new String[5];
		Scanner input=new Scanner(System.in);
		int i;
		System.out.println("Enter 5 names");
		for(i=0;i<5;i++)
		{
			str[i]=input.nextLine();		
		}
		for(i=0;i<5;i++) {
			System.out.println(str[i].toUpperCase());
		}

	}

}
