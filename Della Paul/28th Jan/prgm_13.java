
import java.util.TreeSet;

public class prgm_13 {

	public static void main(String[] args) {
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("Java");
		myset.add("Selenium");
		myset.add("C++");
		System.out.println("the tree set is"+myset);
		TreeSet<String> myset1=new TreeSet<String>();
		myset1.add("perl");
		myset1.add("Unix");
		myset1.add("Ada");
		myset1.add("Java");
		myset.addAll(myset1);
		System.out.println("the new tree set is"+myset);

	}
	
}