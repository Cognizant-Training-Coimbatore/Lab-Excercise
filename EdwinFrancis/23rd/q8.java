import java.util.Scanner;

class programming{
	String name="i love ";
	programming(){
		name=name+"programming language";
		
	}
	programming(String s){
		name=name+s;
	}
}
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		System.out.println("Enter String");
		Scanner input=new Scanner(System.in);
		s=input.nextLine();
		programming obj1=new programming();
		programming obj2=new programming(s);
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		
		
		

	}

}
