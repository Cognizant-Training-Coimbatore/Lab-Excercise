import java.util.ArrayList;

public class pgm_6_vector {
static void printArray(int myarray[])
{
	for (int x:myarray)
	{
		System.out.println(x);
	}
}
static void printArrayList(ArrayList list1)
{
	for(Object obj:list1) {
		System.out.println(obj);
	}
}
	public static void main(String[] args) {
int no[]=new int [3]	;
no[0]=10;
no[1]=59;
no[2]=56;
printArray(no);
ArrayList mylist =new ArrayList();
mylist.add("haii");
mylist.add("hello");
mylist.add("soumya");
printArrayList(mylist);
	}

}
