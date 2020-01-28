import java.util.TreeSet;
import java.util.Iterator;

public class prgm_14 {
public static void main(String[] args) {
  TreeSet <Integer>tree_num = new TreeSet<Integer>();
  TreeSet <Integer>treeheadset = new TreeSet<Integer>();
   
  tree_num.add(1);
  tree_num.add(2);
  tree_num.add(3);
  tree_num.add(54);
  tree_num.add(6);
  tree_num.add(78);
  tree_num.add(8);
  tree_num.add(9);
  tree_num.add(10);
treeheadset = (TreeSet)tree_num.headSet(7);  
for(int x:treeheadset) {
System.out.println(x);
}
 
  }    

}
