package demo;

class test
{
	int a,b;
	void print()
	{
		System.out.println("Print this");
	}
}

public class define_class {

	public static void main(String[] args) {
		test t=new test();
		t.a=10;
		t.b=20;
		t.print();
		System.out.println(t.a+"\t"+t.b);
	}

}
