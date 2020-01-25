class testA{
	int a=10;
}
class testB extends testA{
	int b=35;
}
class testc extends testB{
	void display() {
		int c=a+b;
		System.out.println(c);
	}
	}
	
public class multi_level_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testc obj=new testc();
		obj.display();
	}

}
