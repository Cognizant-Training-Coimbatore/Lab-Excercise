import java.util.ArrayList;
import java.util.List;

public class Q7_28JAN_replace {

	public static void main(String[] args) 
	{
		List<String> name=new ArrayList<String>();
		name.add("how");
		name.add("are");
		name.add("you");
		System.out.println("Original" +name);
		name.set(2, "you people?");
		System.out.println("After replacement" +name);
	}
}