import java.util.Scanner;

class stringact
{
	String str1;
	String str2;
	String conca(String str1, String str2)
	{
		return str1+str2;
	}
	int vowel(String str1)
	{
		int c =0;
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				c++;
			}
			
			
		}j
		return c;
	}
	String lowCase(String str1)
	{
		return str1.toLowerCase();
	}
}
public class program29_stringHandle {

	public static void main(String[] args) 
	{
		System.out.println("Enter two strings :");
		Scanner scanner = new Scanner(System.in);
		String p1 = scanner.nextLine();
		String p2 = scanner.nextLine();
		stringact a1 = new stringact();
		String s1 = a1.conca(p1, p2);
		System.out.println(s1);
		int count = a1.vowel(p1);
		System.out.println(count);
		String s3 = a1.lowCase(p1);
		System.out.println(s3);
		
		
		
		
	}

}
