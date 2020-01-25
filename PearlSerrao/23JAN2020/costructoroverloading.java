package demo;

public class costructoroverloading {
	public static void main(String[] args) {
		sample2 s1=new sample2();
		sample2 s2=new sample2(5);
	}
}
class sample2{
	sample2(){
		System.out.println("hi");
	}
	sample2(int x) {
		
		System.out.println("hello");
	}
}