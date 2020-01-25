package demo;

import java.util.Scanner;

public class vowels_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String st=s.nextLine();
		char a;
		int c=0;
		for(int i=0;i<st.length();i++)
		{
			a=st.charAt(i);
			if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')||(a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U'))
			{
				c++;
			}
		}
		System.out.println("No of vowels="+c);
	}

}
