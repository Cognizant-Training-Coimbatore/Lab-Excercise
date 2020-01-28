import java.util.ArrayList;
import java.util.List;

public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors=new ArrayList<String>();
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Maroon");
		colors.add("Pink");
		System.out.println(colors);
		colors.set(2,"hello");
		System.out.println("New array:"+colors);

	}

}
