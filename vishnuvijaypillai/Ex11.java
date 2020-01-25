class a
{
	int x1=0;
}
class b extends a
{
	int x2=10;
}
class inheret extends b
{
	void display()
	{
		System.out.println("damn u did it ");
	}
}
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheret obj = new inheret();
		obj.display();
	}

}
