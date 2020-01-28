import java.util.TreeSet;

public class Ex6_13_add_elements_treeset {

	public static void main(String[] args) {
		TreeSet<String> myset=new TreeSet<String>();
		TreeSet<String> myset1=new TreeSet<String>();
		myset.add("blue");
		myset.add("green");
		myset.add("yellow");
		myset.add("pink");
		myset.add("white");
		System.out.println("first tree set "+myset);
		
		myset1.add("red");
		myset1.add("cyan");
		System.out.println("second tree set "+myset1);
		
		myset1.addAll(myset);
		System.out.println("new tree set after adding elements of first and second set "+myset1);

	}

}
