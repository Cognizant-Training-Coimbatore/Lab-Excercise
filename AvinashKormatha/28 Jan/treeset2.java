import java.util.TreeSet;

public class treeset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> a = new TreeSet<Integer>();
		a.add(1);
		a.add(9);
		a.add(4);
		a.add(10);
		for(int x:a)
		{
			if(x<7)
			{
				System.out.println(x);
			}
			else
			{
				break;
			}
		}
	}

}
