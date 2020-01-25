import java.util.Scanner;
public class day2_ques10 {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		 s=sc.nextLine();
		 int length=s.length();
		 int i;
		 String rev="";
		 for(i=length-1;i>=0;i--)
		 {
			 rev=rev+s.charAt(i);
		 }
		 if(s.equals(rev))
		 {
			 System.out.println("String is paliandrome");
		 }
		 else
		 {
			 System.out.println("String is not paliandrome");
		 }
	}

}
