package packB;

public class Exer4_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,5,4,7};
		int[] arr2 = new int[arr1.length];
		arr2=arr1.clone();
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	}

}
