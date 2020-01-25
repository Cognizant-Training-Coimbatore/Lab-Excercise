class sample3
{ void display()
	{System.out.println("display is working");
	
	}
	void display(int a)
	{System.out.println(a);
	}
	
}
public class methodoverload {

	public static void main(String[] args) {
		sample3 obj=new sample3();
		obj.display();
		obj.display(3);
	}

}
