import java.util.TreeSet;
import java.util.Iterator;

 
public class qn15_15 {
	 public static void main(String[] args) {
		   TreeSet <Integer>tree_num = new TreeSet<Integer>();
		   
		     
		   tree_num.add(10);
		   tree_num.add(22);
		   tree_num.add(36);
		   tree_num.add(25);
		   tree_num.add(16);
		   tree_num.add(70);
		   tree_num.add(82);
		   tree_num.add(89);
		   tree_num.add(14);
		   
		   System.out.println("Greater than or equal to 86 : "+tree_num.ceiling(86));
		   System.out.println("Greater than or equal to 29 : "+tree_num.ceiling(29));
		   }    

}
