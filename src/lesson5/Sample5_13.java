package lesson5;

//P212
public class Sample5_13 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		//配列はメソッドの引数に入れた場合呼び出し元の配列と
		//メソッドの配列は同じ扱いになってしまう。
		incArray(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	/**
	 * 配列内の要素全てに１を加えるメソッド
	 * @param array
	 */
	//仮引数のarrayを変更した場合、実引数に入れた配列も変更される
	public static void incArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
}
