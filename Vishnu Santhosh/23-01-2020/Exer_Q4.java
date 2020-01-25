class calc{
	int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	int div(int a,int b) {
		return a/b;
	}
}
public class Exer_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj = new calc();
		System.out.println(obj.add(45, 75));
		System.out.println(obj.sub(45, 75));
		System.out.println(obj.mul(45, 75));
		System.out.println(obj.div(45, 75));
	}

}
