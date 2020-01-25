import java.util.Random;

public class random_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int a= r.nextInt();
		double b = r.nextDouble();
		System.out.println(b);
		System.out.println(a);
		System.out.println(Math.random());
	}

}
