package demo;

public class hierarinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 B11 b=new B11();
 b.display();
 C11 c=new C11();
 c.display();
	}

}
class A11{
	int x=3;
}
class B11 extends A11{
	int y=6;
	void display() {
		System.out.println(x+y);
	}
}
class C11 extends A11
{
	int z=3;
void display() {
		System.out.println(x+z);
}
}

