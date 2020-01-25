package demo;

public class staticvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t1=new test1();
		t1.display();
		test1 t2=new test1();
		t2.display();
	}

}
class test1{
	static int a;
	void display() {
		a++;
		System.out.println(a);
	}
	
}