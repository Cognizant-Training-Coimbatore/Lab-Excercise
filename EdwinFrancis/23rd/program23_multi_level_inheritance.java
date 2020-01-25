package demo;
class testA{
	int a=10;
}
class testB extends testA{
	int b=30;
}
class testC extends testB{
	int c;
	void display() {
		c=a+b;
		System.out.println(c);
	}
}

public class program23_multi_level_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        testC obj=new testC(); 
        obj.display();
	}

}
