package demo;
class abc
{
	static int i=0;
	static void display()
	{
		i++;
		System.out.println(i);
	}
}
public class static_method_variabvles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc ab=new abc();
		abc ab1=new abc();
		abc ab2=new abc();
		abc ab3=new abc();
		ab.display();
		ab1.display();
		ab2.display();
		ab3.display();
	}

}
