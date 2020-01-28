import java.util.HashMap;

public class collectionview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(2, "Java");
		hashmap1.put(1, "C#");
		hashmap1.put(6, "Selenium");
		hashmap1.put(4, "Perl");
		hashmap1.put(5, "Cobol");
		hashmap1.put(3, "Fortran");
		System.out.println(hashmap1.values());
	}

}
