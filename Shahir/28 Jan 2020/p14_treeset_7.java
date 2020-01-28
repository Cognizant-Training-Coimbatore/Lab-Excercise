import java.util.Iterator;
import java.util.TreeSet;

public class p14_treeset_7
{
	public static void main(String[] args)
	{ 
	   TreeSet <Integer>tn = new TreeSet<Integer>();
	   TreeSet <Integer>th = new TreeSet<Integer>();
	   tn.add(1);
	   tn.add(2);
	   tn.add(3);
	   tn.add(5);
	   tn.add(6);
	   tn.add(7);
	   tn.add(8);
	   tn.add(9);
	   tn.add(10);
	   System.out.println("Tree Set: " +tn);
	   th = (TreeSet)tn.headSet(7);  
	   Iterator iterator = th.iterator();
	   System.out.println("Tree set data: ");     
	   while (iterator.hasNext())
	   {
		   System.out.println(iterator.next());
	   }
	}
}