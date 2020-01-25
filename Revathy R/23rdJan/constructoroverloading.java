
class sample4
{
	sample4()
	{System.out.println("constructor is working");
	
	}
	sample4(int a)
	{System.out.println(a);
	
	}
}
public class constructoroverloading {

	public static void main(String[] args) {
		sample4 obj=new sample4();
		sample4 obj1=new sample4(4);

	}

}
