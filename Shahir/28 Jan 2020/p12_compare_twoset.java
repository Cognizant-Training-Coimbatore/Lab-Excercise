import java.util.HashSet;

public class p12_compare_twoset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> myset = new HashSet<String>();
		myset.add("Black");
		myset.add("Red");
		myset.add("White");
		myset.add("Blue");
		System.out.println("Printing all items: "+myset);
		HashSet<String> myset2 = new HashSet<String>();
		myset2.add("Black");
		myset2.add("Pink");
		myset2.add("White");
		myset2.add("Green");
		System.out.println("Printing all items: "+myset2);
		myset.retainAll(myset2);
        System.out.println("Set content: "+myset);
	}

}
