class shape1
{
	
}
class circle extends shape1
{
	void draw()
	{
		System.out.println("circle");
	}
	void erase()
	{
		
	}
}
class triangle extends shape1
{
	void draw()
	{
		System.out.println("triangle");
	}
	void erase()
	{
		
	}
}
class square extends shape1
{
	void draw()
	{
		System.out.println("square");
	}
	void erase()
	{
		
	}
}
public class shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square obj= new square();
		obj.draw();
	}

}
