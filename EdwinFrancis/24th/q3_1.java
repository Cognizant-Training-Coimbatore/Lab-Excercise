class a{
	int a=5;
}
class b extends a{
	int b=10;
	void display() {
		System.out.println(a+b);
	}
}
public class q3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b obj=new b();
		obj.display();

	}

}
