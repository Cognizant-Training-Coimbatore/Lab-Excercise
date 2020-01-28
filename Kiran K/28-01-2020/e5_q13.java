package demo;

import java.util.TreeSet;

public class e5_q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>mysettree1 = new TreeSet<String>();
		mysettree1.add("Arsenal");
		mysettree1.add("United");
		mysettree1.add("Chelsea");
		mysettree1.add("Liverpool");
		mysettree1.add("City");
		System.out.println("Old set: "+mysettree1);
		TreeSet<String>mysettree2 = new TreeSet<String>();
		mysettree1.add("D1");
		mysettree1.add("D2");
		mysettree2.addAll(mysettree1);
		System.out.println("New set: "+mysettree2);
	}

}
