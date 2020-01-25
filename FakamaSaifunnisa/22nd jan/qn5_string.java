import java.util.Scanner;

class String_handler{
	String s1;
	String s2;
	String combine(String s1,String s2) {
		return s1+s2;
	}
	String convertlowercase(String s1) {
		return s1.toLowerCase();
	}
	int vowels(String s1) {
		s1=s1.toLowerCase();
		char str[] = s1.toCharArray();
		 int n= str.length;
		 int vowels=0;
		 int i;
		     for(i=0;i<n;i++)
		     {
		       if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||str[i]=='o' || str[i]=='u' || str[i]=='A' ||str[i]=='E' || str[i]=='I' || str[i]=='O' ||str[i]=='U')
		         {
		           vowels++;
		         }
		     }
		     return vowels;
	}
}
public class qn5_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_handler a1=new String_handler();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string 1 ang string 2");
		a1.s1=sc.nextLine();
		a1.s2=sc.nextLine();
		System.out.println(a1.combine(a1.s1,a1.s2));
		System.out.println(a1.convertlowercase(a1.s1));
		System.out.println(a1.vowels(a1.s1));
		

	}

}
