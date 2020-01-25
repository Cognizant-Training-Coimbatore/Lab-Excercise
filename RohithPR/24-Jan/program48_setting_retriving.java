class setRetr
{
	static int i = 89;
	static void display()
	{
		i = i+1;
		System.out.println(i);
	}
}
public class program48_setting_retriving {

	public static void main(String[] args) 
	{
		setRetr obj = new setRetr();
		obj.display();

	}

}
