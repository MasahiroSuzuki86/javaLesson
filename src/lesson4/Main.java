package lesson4;

public class Main {
	public static void main(String[] args) {

		//配列の中には1,2,3が入っている
		//8832番地がArrayAに入ってる
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		
		//配列Bに配列Aを代入
		//配列Bに配列Aの住所を代入
		//配列Bに入ってる住所も8832になる
		arrayB = arrayA;
		
		//配列Bに入ってる住所8832から数えて0番目の要素に100を書き込む
		arrayB[0] = 100;
		//配列Aに入ってる住所8832から数えて0番目の要素を読む
		System.out.println(arrayA[0]);
	}
}
