import java.util.TreeSet;

public class prg28_qn13_all_element_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>mysettree1 = new TreeSet<String>();
		mysettree1.add("Athira");
		mysettree1.add("Revathy");
		mysettree1.add("Fakama");
		mysettree1.add("Della");
		mysettree1.add("Dona");
		System.out.println("Old set: "+mysettree1);
		TreeSet<String>mysettree2 = new TreeSet<String>();
		mysettree1.add("D1");
		mysettree1.add("D2");
		mysettree2.addAll(mysettree1);
		System.out.println("New set: "+mysettree2);
	}

}
