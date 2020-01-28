import java.util.HashMap;
public class p17_collection_view
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> h= new HashMap<Integer,String>();  
		h.put(1, "Hi");
		h.put(2, "Hey");
		h.put(3, "Hola");
		h.put(4, "Hello");
		System.out.println("Size of the hash map: "+h.size());
		System.out.println("Collection view is: "+ h.values());
	 }
}