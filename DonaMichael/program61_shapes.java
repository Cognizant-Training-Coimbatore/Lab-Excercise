class shapes
{
	void draw()
	{
		System.out.println("Draw in shape");
	}
	void erase(){
		System.out.println("Erase in shape");
	}
	}
class circles extends shape{
	void draw()
	{
		System.out.println("draw in circle");
	}
	void erase()
	{
		System.out.println("Erase in circle");
	}
}
class triangle extends shape{
	void draw()
	{
		System.out.println("Draw in triangle");
	}
	void erase()
	{
		System.out.println("Erase in triangle");
	}
}
class squares extends shape{
	void draw()
	{
		System.out.println("Draw in square");
	}
	void erase()
	{
		System.out.println("Erase in square");
	}
}
public class program61_shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circles cc=new circles();
		cc.draw();
		cc.erase();
		triangle tt=new triangle();
		tt.draw();
		tt.erase();
		squares ss=new squares();
		ss.draw();
		ss.erase();
	}

}
