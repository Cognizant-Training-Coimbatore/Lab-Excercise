package demo;

import java.util.ArrayList;

public class e5_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> mysomelist = new ArrayList<String>();
		mysomelist.add("Arsenal");
		mysomelist.add("United");
		mysomelist.add("Chelsea");
		mysomelist.add("Liverpool");
		System.out.println("Total items "+mysomelist.size());
		mysomelist.ensureCapacity(7);
		mysomelist.add("City");
		mysomelist.add("Spurs");
		mysomelist.add("Wolves");
		System.out.println("Total items "+mysomelist.size());
	}

}
