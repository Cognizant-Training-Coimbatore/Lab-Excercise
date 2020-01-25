import java.util.Scanner;

public class capName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= new String[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.next();
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(" "+s[i].toUpperCase());
		}
	}

}
