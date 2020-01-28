import java.util.*;
public class qn_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist=new ArrayList<String>();
		mylist.add("res");
		mylist.add("ram");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		mylist.add(0,s);
		System.out.println(mylist);

	}

}
