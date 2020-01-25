import java.util.Scanner;

public class day2_qn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		s=s.toLowerCase();
		char str[] = s.toCharArray();
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
		     System.out.println(vowels);
	}

}
