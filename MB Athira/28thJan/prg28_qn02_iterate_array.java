import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class prg28_qn02_iterate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>SArray = new ArrayList<String>();
		SArray.add("Fakama Saifuniza");
		SArray.add("Della Paul");
		SArray.add("Rohit P R");
		SArray.add("Revathy R");
		SArray.add("Dona Michael");
		SArray.add("Sreejith Sreedharan");
		Iterator it2 = SArray.iterator();
		while(it2.hasNext())
		{
			Object obj = it2.next();
			System.out.println(obj);
		}
		
	}

}
