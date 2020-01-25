package demo;
class test1{
	static int x;
	void display() {
		x++;
		System.out.println(x);
	}
}
public class staticvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         test1 obj=new test1();
         obj.display();
         test1 obj2=new test1();
         obj2.display();
	}

}
