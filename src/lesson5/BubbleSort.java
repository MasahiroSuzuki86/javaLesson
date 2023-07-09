package lesson5;

public class BubbleSort {
	public static void main(String[] args) {

		//配列の作成
		int[] intArray = new int[5];

		//乱数の格納
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = new java.util.Random().nextInt(100) + 1;
		}

		//配列の中身を全て表示
		System.out.println("ソート前の配列");
		//printArrayメソッド呼び出し
		printArray(intArray);

		//昇順ソートする
		//sortAscメソッド呼び出し
		sortAsc(intArray);

		//配列の中身を全て表示
		//printArrayメソッド呼び出し
		System.out.println("昇順ソート後の配列");
		printArray(intArray);

		//降順ソートする
		//sortDescメソッド呼び出し
		sortDesc(intArray);
		
		//配列の中身を全て表示
		System.out.println("降順ソート後の配列");
		//printArrayメソッド呼び出し
		printArray(intArray);
	}
	
	/**
	 * 配列の中身を全て表示するメソッド
	 * 表示して終わりなので戻り値はなし
	 * @param intArray
	 */
	public static void printArray(int[] intArray) {
		//配列の中身を全て表示
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("要素[" + i +  "]:" + intArray[i]);
		}
	}
	
	/**
	 * 配列の中身を昇順にソートするメソッド
	 * 配列は参照型
	 * 戻り値をメインメソッドに返さなくても
	 * 並べ替えた情報は保持されるs
	 * @param intArray
	 */
	public static void sortAsc(int[] intArray) {
		//昇順ソートする
		for (int i = 0; i < intArray.length - 1; i++) {
			//iは比較する範囲を制御する変数
			//iは0から1ずつ足されて48まで動く
			for (int j = intArray.length - 1; j > i; j--) {
				//jは48から1ずつ引かれてi + 1まで動く
				//iが0なら48から1まで
				//iが1なら48から2まで
				if (intArray[j - 1] > intArray[j]) {
					//[j-1]とjを比べてj-1の方が大きかったら入れ替える
					//繰り返すことで一番小さいものがiに格納される
					int tmp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = tmp;
				}
			}
		}
	}
	
	/**
	 * 配列の中身を降順にソートするメソッド
	 * 昇順と同じように並べ替えた情報は
	 * 戻り値で返さなくても保持される
	 * @param intArray
	 */
	public static void sortDesc(int[] intArray) {
		//降順ソートする
		for (int i = 0; i < intArray.length - 1; i++) {
			//iは0から1ずつ足されて48まで動く
			for (int j = intArray.length - 1; j > i; j--) {
				//jは48から1ずつ引かれてi + 1まで動く
				if (intArray[j - 1] < intArray[j]) {
					//[j-1]とjを比べてj-1の方が小さかったら入れ替える
					//繰り返すことで一番大きいものがiに格納される
					int tmp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = tmp;
				}
			}
		}
	}
	
	
	
	
}
