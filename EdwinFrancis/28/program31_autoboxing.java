package demo;

public class program31_autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		Integer obj=x;//autoboxing
		System.out.println(obj.compareTo(200));
		System.out.println(obj.compareTo(100));
		int y=obj;
		System.out.println(y);//unboxing
		System.out.println(Integer.parseInt("1232")+2);

	}

}
