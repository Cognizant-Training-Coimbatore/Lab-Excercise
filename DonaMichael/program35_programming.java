import java.util.Scanner;

class programming{
	String x;
	
	programming()
	{
		x="I love programming languages";
	}
	
	programming(String y)
	{
		x="I love "+y;
	}
	void display() {
	System.out.println(x);
	
	}
	
	
}
	public class program35_programming {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string to be passed:");
		String y=s.nextLine();
		programming p=new programming();
		programming p1=new programming(y);
		if(y==null) {
		p.display();}
		else
			p1.display();
	}

}
