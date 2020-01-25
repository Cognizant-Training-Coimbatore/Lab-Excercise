class shapes
{
	void draw()
	{
		System.out.println("draw in shape");
	}
	void erase()
	{
		System.out.println("erase in shape");
	}
}
class circles extends shape
{
	void draw()
	{
	System.out.println("draw in circle");
	}
	void erase()
	{
		System.out.println("erase in circle");
	}
}
class triangle extends shape
{
	void draw()
	{
	System.out.println("draw in triangle");
	}
	void erase()
	{
		System.out.println("erase in triangle");
	}
}
class squares extends shape
{
	void draw()
	{
	System.out.println("draw in square");
	}
	void erase()
	{
		System.out.println("erase in square");
	}
}
public class newpgm8poly {

	public static void main(String[] args) {
		circles cc=new circles();;
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
