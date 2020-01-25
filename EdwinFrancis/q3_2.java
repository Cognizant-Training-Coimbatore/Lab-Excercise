class a{
	int a=5;
}
class b extends a{
	int b=15;
}
class c extends b {
	int c=a+b;
	void display() {
		System.out.println(c);	
		}
}
public class q3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj=new c();
		obj.display();
		

	}

}
