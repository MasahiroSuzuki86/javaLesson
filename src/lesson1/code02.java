package lesson1;

public class code02 {
	public static void main(String[] args) {

		//aとbを入れ替えたい
		int a = 34;
		int b = 23;
		
		//退避用の変数
		int c = b;
		b = a;
		a = c;
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
