import java.util.Scanner;

public class program36_no_of_vowels {

	public static void main(String[] args) 
	{
		int count = 0;
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		for (int i=0 ; i<c.length(); i++)
		{
	         char ch = c.charAt(i);
	         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' ')
	         {
	            count ++;
	         }
	      }
	      System.out.println("Number of vowels in the given sentence is "+count);
		


	}

}
