package demo;
class testX{
	int x=100;
}
class testY extends testX{
	int x=10;
	void display() {
		System.out.println(super.x);//"super" is used to get values of subclass;
	}
}
public class program25_super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testY obj=new testY();
		obj.display();

	}

}
