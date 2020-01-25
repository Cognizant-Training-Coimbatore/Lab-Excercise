class a1{
	void display()
	{
		System.out.println("this is parrent class");
	}
}
class b1 extends a1{
	void display1()
	{
		System.out.println("this is child class");
	}
}
public class session2_qn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a1 a=new a1();
		b1 a2=new b1();
		a.display();
		a2.display1();
		a2.display();
		

	}

}
