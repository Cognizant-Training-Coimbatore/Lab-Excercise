
public class autoboxing {

	public static void main(String[] args) {
		int x=100;
		Integer obj=x;
		System.out.println(obj.compareTo(200));
		System.out.println(obj.compareTo(100));
		int y=obj;
		System.out.println(y);
		System.out.println(Integer.parseInt("123")+2);
		

	}

}
