package demo;

public class auto_boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		Integer obj=x;
		System.out.println(obj.compareTo(200));
		System.out.println(obj.compareTo(100));
		int y=obj;
		System.out.println(y);
		System.out.println(Integer.parseInt("100")+2);
	}

}
