package demo;

public class question7_arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]=new int[5];
		int arr1[]= {2,3,4,5,6};
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("Elements of array 1:");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("Elements of array 2:");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}
