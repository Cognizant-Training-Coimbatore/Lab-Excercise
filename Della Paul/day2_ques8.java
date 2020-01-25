import java.util.Scanner;

public class day2_ques8{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string1");
		String s1=s.nextLine();
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
		System.out.println(vowels);
		
	}

}


