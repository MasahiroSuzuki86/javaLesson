package lesson4;

public class Rensyu4_12 {
	public static void main(String[] args) {
		
		int[] seq = new int[10];
		
		//seqには0〜3までの乱数が格納されている
		for(int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		char[] base = {'A', 'T', 'G', 'C'};
		
		// switch文を書き換える
		for(int i = 0; i < seq.length; i++) {
			//seq[i]には0〜3までの乱数が入っているから・・・？
			System.out.print(base[seq[i]] + " ");
		}
		
		// switch文でもかけるけど長ったらしい・・・
//		for(int i = 0; i < seq.length; i++) {
//			switch(seq[i]) {
//			case 0:
//				System.out.print("A ");
//				break;
//			case 1:
//				System.out.print("T ");
//				break;
//			case 2:
//				System.out.print("G ");
//				break;
//			case 3:
//				System.out.print("C ");
//				break;
//			}
//		}
	}

}
