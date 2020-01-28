import java.util.HashSet;
import java.util.Set;

public class qn_13_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myset=new HashSet<String>();
		myset.add("one");
		myset.add("two");
		Set<String> myset1=new HashSet<String>();
		myset1.addAll(myset);
		System.out.println(myset1);
		
	}

}
