class printCharAndInt{
	void print(char c,int a) {
		System.out.println("Character= "+c);
		System.out.println("Integer= "+a);
	}
	void print(int a,char c) {
		System.out.println("\n\nInteger= "+a);
		System.out.println("Character= "+c);
	}
}
public class Exer_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCharAndInt obj1 = new printCharAndInt();
		printCharAndInt obj2 = new printCharAndInt();
		obj1.print('a', 7);
		obj1.print(12, 'v');
	}

}
