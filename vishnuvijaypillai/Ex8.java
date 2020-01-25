import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String a1;
		Scanner scanner = new Scanner(System.in);
		a1=scanner.nextLine();
		for(int j=0;j<a1.length();j++)
		{	
			char ch=a1.charAt(j);	
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
