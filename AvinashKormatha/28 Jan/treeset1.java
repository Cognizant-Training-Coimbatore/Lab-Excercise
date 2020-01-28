import java.util.TreeSet;

public class treeset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> a = new TreeSet<String>();
		a.add("java");
		a.add("selenium");
		TreeSet<String> a1 = new TreeSet<String>();
		a1.add("c++");
		a1.add("python");
		a.addAll(a1);
		System.out.println(a);
	}

}
