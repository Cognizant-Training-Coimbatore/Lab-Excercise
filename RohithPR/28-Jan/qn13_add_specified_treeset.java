import java.util.TreeSet;

public class qn13_add_specified_treeset {

	public static void main(String[] args) 
	{
		TreeSet<String>mysettree1 = new TreeSet<String>();
		mysettree1.add("Batman");
		mysettree1.add("Superman");
		mysettree1.add("Wonder Women");
		mysettree1.add("Flash");
		mysettree1.add("Aquaman");
		System.out.println("Old set: "+mysettree1);
		TreeSet<String>mysettree2 = new TreeSet<String>();
		mysettree1.add("Martian Man Hunter");
		mysettree1.add("Cyborg");
		mysettree2.addAll(mysettree1);
		System.out.println("New set: "+mysettree2);
		

	}

}
