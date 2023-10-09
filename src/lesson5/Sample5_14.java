package lesson5;

public class Sample5_14 {
	
	public static void main(String[] args) {
		//makeArrayメソッドを引数3で呼び出し
		int[] array = makeArray(3);
		
		//arrayの中身を全て表示
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
//		for(int i : array) {
//			System.out.println(i);
//		}
	}
	
	//引数に入れた大きさの配列を返すメソッド
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
		return newArray;
	}

}
