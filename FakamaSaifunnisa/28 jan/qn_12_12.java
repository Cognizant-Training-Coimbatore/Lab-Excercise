import java.util.*;
public class qn_12_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myset=new HashSet<String>();
		myset.add("one");
		myset.add("two");
		Set<String> myset1=new HashSet<String>();
		myset1.add("ones");
		myset1.add("two");
		myset.retainAll(myset1);
		System.out.println(myset);
		

	}

}
