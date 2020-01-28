import java.util.TreeSet;
public class p15_treeset_greater
{
	public static void main(String[] args)
	{
	   TreeSet <Integer>tn = new TreeSet<Integer>();
	   TreeSet <Integer>th = new TreeSet<Integer>();
	   tn.add(1);
	   tn.add(2);
	   tn.add(3);
	   tn.add(6);
	   tn.add(7);
	   tn.add(8);
	   tn.add(9);
	   tn.add(10);
	   System.out.println("Tree Set: " +tn);
	   System.out.println("Number greater than or equal to: " +tn.ceiling(5));
	}

}
