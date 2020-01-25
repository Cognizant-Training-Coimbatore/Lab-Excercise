import java.awt.geom.Area;
import java.util.Scanner;

class area{
	int len,br;
	int returnArea(int l,int b) {
		
		int area1=l*b;
		return area1;
	}
}
public class program_26_area_of_rectangle {

	public static void main(String[] args) {
		System.out.println("Enter the value of length and breadth:");
		Scanner s=new Scanner(System.in);
		area obj=new area();
		obj.len=s.nextInt();
		obj.br=s.nextInt();
		int a1=obj.returnArea(obj.len,obj.br);
		System.out.println("Area is:"+a1);
		
	}

}
