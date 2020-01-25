import java.util.Scanner;

class String_handler{
	String s1;
	String s2;
	String add(String s1,String s2)
	{
		return s1+s2;
		
	}
	String lowercase(String s1)
	{
		return s1.toLowerCase();
	}
	int vowels(String s1)
	{
		s1=s1.toLowerCase();
		char str[]=s1.toCharArray();
		int n=str.length;
		int vowels=0;
		int i=0;
		for(i=0;i<n;i++)
		{
			if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'|| str[i]=='u')
			{
				vowels++;
			}
		}
				
			return vowels;		
		
	}
}
public class ques5_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_handler a=new String_handler();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string1");
		a.s1=s.nextLine();
		System.out.println("enter the string2");
		a.s2=s.nextLine();
		System.out.println("combining two strings give"+a.add(a.s1,a.s2));
		System.out.println("lowercase is"+a.lowercase(a.s1));
		System.out.println("vowels is"+a.vowels(a.s1));
		
	}

}
