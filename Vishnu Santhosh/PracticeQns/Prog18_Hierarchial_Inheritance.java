class p1{
	int x=10;
}
class c1 extends p1{
	int y=20;
	void display(){
		System.out.println(x+y);
	}
}
class c2 extends p1{
	int z=40;
	void display(){
		System.out.println(x+z);
	}
}
public class Prog18_Hierarchial_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 obj1 = new c1();
		c2 obj2 = new c2();
		obj1.display();
		obj2.display();
	}

}
