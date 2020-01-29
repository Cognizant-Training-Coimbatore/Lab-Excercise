import java.util.Iterator;
import java.util.TreeSet;

public class Q2_28JAN_iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> order = new TreeSet<String>();
		order.add("Avinash");
		order.add("Aaron");
		order.add("Arun");
		order.add("Arbaz");
		order.add("Aap");
		System.out.println(order);
		Iterator I = order.iterator();
		while(I.hasNext())
		{
				Object aa=I.next();
				System.out.println(aa);
		}
		for(Object aa:order)
		{
			System.out.println(aa);
		}
	}

}
