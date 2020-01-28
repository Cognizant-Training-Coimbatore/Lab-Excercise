import java.util.ArrayList;
import java.util.List;

public class prg28_qn06_size_array_increase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> mysomelist = new ArrayList<String>();
		mysomelist.add("Revathy");
		mysomelist.add("Fakama");
		mysomelist.add("Athira");
		mysomelist.add("Della");
		System.out.println("Total items "+mysomelist.size());
		mysomelist.ensureCapacity(7);
		mysomelist.add("Sreejith");
		mysomelist.add("Rohit");
		mysomelist.add("Dona");
		System.out.println("Total items "+mysomelist.size());

	}

}
