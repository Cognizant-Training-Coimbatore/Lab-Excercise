import java.util.TreeSet;

public class Exs6_14_numer_lessthan7_treeset {

	public static void main(String[] args) {
		
		TreeSet<Integer> myset=new TreeSet<Integer>();
		myset.add(1);
		myset.add(7);
		myset.add(10);
		myset.add(3);
		myset.add(4);
		System.out.println(myset);
		System.out.println("Elements less than 7 in the tree set are "); 
		for(int x:myset)
		{
			if(x<7)
			{
				System.out.println(x);
			}
		}
		
	}

}
