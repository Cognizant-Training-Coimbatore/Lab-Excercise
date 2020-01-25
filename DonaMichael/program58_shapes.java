class shape{
	void display()
	{
		System.out.println("This is shape");
	}
}
class rectangle extends shape{
	void display1()
	{
		System.out.println("This is rectangular shape");
	}
}
class square extends rectangle{
	void display3()
	{
		System.out.println("square is a rectangle");
	}
}
class circle extends shape{
	void display2()
	{
		System.out.println("This is circular shape");
	}
}
public class program58_shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square obj=new square();
		obj.display();
		obj.display1();
	}

}
