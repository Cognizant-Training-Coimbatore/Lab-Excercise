import java.util.Scanner;

public class program45_vowelscount 
{

	public static void main(String[] args)
	{
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int c =0;
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				c++;
			}
		}
		System.out.println("Vowels count :"+c);
	}

}
