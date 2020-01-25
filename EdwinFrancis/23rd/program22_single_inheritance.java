package demo;
class test3{
	int x=2;
}
class test4 extends test3
{
	int y=10;
	void display() {
		System.out.println(x+y);
	}
}

public class program22_single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4 obj=new test4();
		obj.display();

	}

}
