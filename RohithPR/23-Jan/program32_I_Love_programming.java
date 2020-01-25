import java.util.Scanner;

class programming
{
	String word = "I LOVE ";
	programming()
	{
		word="I LOVE PROGRAMMING";
		
	}
	programming(String w)
	{
		word = word+w;
		
	}
}
public class program32_I_Love_programming {

	public static void main(String[] args) 
	{
		programming obj = new programming();
		System.out.print("Enter the word -");
		Scanner scanner = new Scanner(System.in);
		String w = scanner.next();
		
		programming obj1 = new programming(w);
		System.out.println(obj.word);
		System.out.println(obj1.word);
		
	}

}
