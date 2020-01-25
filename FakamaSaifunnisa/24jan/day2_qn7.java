import java.util.Scanner;

public class day2_qn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s=sc.nextLine();
			int length=s.length();
			String res="";
			for(int i=length-1;i>=0;i--)
			{
				res=res+s.charAt(i);
			}
			System.out.println(res);
	}

}
