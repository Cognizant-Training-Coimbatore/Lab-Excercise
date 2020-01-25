import java.util.Scanner;
public class program44_vowel {

	public static void main(String[] args) {
		String s1;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		s1=sc.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count=count+1;
			}
		}
		System.out.println("Number of vowels in string "+s1+" is "+count);

		
}
}
