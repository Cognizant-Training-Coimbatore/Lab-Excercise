package demo;

public class prog9 {
	public static void main(String[] args) {
	seq s1=new seq(5,'c');
	seq s2=new seq('e',7);
}
}
	
class seq{
	seq(int i, char c){
	
		System.out.println("no is"+i+"char is"+c);
	}
	seq(char c,int i){
		System.out.println("char is"+c+"no is"+i);
	}
}

	
