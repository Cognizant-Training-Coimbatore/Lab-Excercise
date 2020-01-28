import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class prgm_18 {

public static void main(String[] args) {
// TODO Auto-generated method stub
HashMap<Integer, String> hashmap1 =new HashMap<Integer, String>();
hashmap1.put(1, "della");
hashmap1.put(2, "dona");
hashmap1.put(3, "dhinu");
hashmap1.put(4, "basil");
hashmap1.put(5, "boby");
hashmap1.put(6, "jeeva");
Set<Integer> key = hashmap1.keySet();
int lkey=999,mkey=-999;
for(int x:key) {
if(x>mkey)
if(x<lkey)
mkey=x;
lkey=x;
}
System.out.println("Minimum key-value pair: "+lkey+'-'+hashmap1.get(lkey));
System.out.println("Maximum key-value pair: "+mkey+'-'+hashmap1.get(mkey));
}

}

