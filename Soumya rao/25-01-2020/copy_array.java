package protcted_2;

public class copy_array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]=new int [a.length];
		b=a;
		
		System.out.println("elements of a[] "); 
        for (int i=0; i<a.length; i++) 
            System.out.print(a[i] + " "); 
        System.out.println("\n"+"elements of b[] "); 
        for (int i=0; i<b.length; i++) 
            System.out.print(b[i] + " "); 
	}

}
