import java.util.TreeSet;
import java.util.Iterator;

public class prg28_qn14_lessthan7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>mysettree14 = new TreeSet<Integer>();
		TreeSet<Integer>mysettree141 = new TreeSet<Integer>();
		mysettree14.add(23);
		mysettree14.add(1);
		mysettree14.add(4);
		mysettree14.add(67);
		mysettree14.add(6);
		System.out.println("No. set: "+mysettree14);
		mysettree141 = (TreeSet)mysettree14.headSet(7);
		for (int i:mysettree141) 
		{
			System.out.println(i);
		}
	}

}
