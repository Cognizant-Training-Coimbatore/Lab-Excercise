import java.util.ArrayList;
import java.util.List;

public class prg28_qn08_printallele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mysomelist = new ArrayList<String>();
		mysomelist.add("Revathy");
		mysomelist.add("Fakama");
		mysomelist.add("Athira");
		mysomelist.add("Della");
		mysomelist.add("Sreejith");
		mysomelist.add("Rohit");
		mysomelist.add("Dona");
		for (int i = 0; i < mysomelist.size(); i++) 
		{
			String Frname = mysomelist.get(i);
			System.out.println(Frname);
		}
	}

}
