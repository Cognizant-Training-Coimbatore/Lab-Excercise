import java.util.Scanner;

class stringHandler{
	String stringAdd(String a, String b) {
		return a+b;
	}
	void vowel(String a) {
		int c=0;
		String b=a.toLowerCase();
		char[] vow= {'a','e','i','o','u'};
		char[] ch=b.toCharArray();
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<5;j++) {
				if(vow[j]==ch[i])
					c++;
			}
		}
		System.out.println("No of vowels= "+c);
		System.out.println("Lower case string= "+b);
	}
}
public class Exer_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringHandler obj = new stringHandler();
		Scanner scan = new Scanner(System.in);
		System.out.println(obj.stringAdd("Lorem ", "Ipsum!"));
		System.out.print("Enter string: ");
		String str = scan.next();
		obj.vowel(str);
	}

}
