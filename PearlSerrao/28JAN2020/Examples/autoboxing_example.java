package demo;

public class autoboxing_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		Integer o=x;
		System.out.println(o.compareTo(200));
		System.out.println(o.compareTo(100));
		int y=o;
		System.out.println(y);
		System.out.println(Integer.parseInt("123")+2);
	}

}
