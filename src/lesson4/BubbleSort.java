package lesson4;

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
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("要素[" + i +  "]:" + intArray[i]);
		}

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

		//配列の中身を全て表示
		System.out.println("昇順ソート後の配列");
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("要素[" + i +  "]:" + intArray[i]);
		}

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
		
		//配列の中身を全て表示
		System.out.println("降順ソート後の配列");
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("要素[" + i +  "]:" + intArray[i]);
		}
	}
	
	/**
	 * 配列の中身を全て表示するメソッド
	 * @param intArray
	 */
	public static void printArray(int[] intArray) {
		//配列の中身を全て表示
		System.out.println("降順ソート後の配列");
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("要素[" + i +  "]:" + intArray[i]);
		}
	}
	
	/**
	 * 配列の中身を昇順にソートするメソッド
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
