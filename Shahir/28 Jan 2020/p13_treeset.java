import java.util.TreeSet;

public class p13_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset = new TreeSet<String>();
		myset.add("Black");
		myset.add("Red");
		myset.add("White");
		myset.add("Blue");
		System.out.println("Printing all items: "+myset);
		TreeSet<String> myset2 = new TreeSet<String>();
		myset2.add("Pink");
		myset2.add("Green");
		System.out.println("Printing all items: "+myset2);
		myset.addAll(myset2);
        System.out.println("Tree Set 1: "+myset);
	}

}
