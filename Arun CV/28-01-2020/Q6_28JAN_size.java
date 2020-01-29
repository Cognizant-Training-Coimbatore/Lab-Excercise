import java.util.ArrayList;

public class Q6_28JAN_size {
	static void printArray(String nor[])
	{
		for(String a: nor)
		{
			System.out.println(a);
		}
	}
	static void printArrayList(ArrayList increase)
	{
		for(Object well:increase)
		{
			System.out.println(well);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String no[]=new String[5];
		no[0]="what";
		no[1]="is";
		no[2]="happening";
		no[3]="over";
		no[4]="here?";
		printArray(no);
		ArrayList<String> keepthis=new ArrayList<String>();
		keepthis.add("This");
		keepthis.add("is how");
		keepthis.add("the things");
		keepthis.add("workout here");
		printArrayList(keepthis);
	}

}
