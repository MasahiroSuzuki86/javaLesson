package lesson4;

public class Rensyu4_99 {
	public static void main(String[] args) {

	//1 配列の作成
	int[] intArray = new int[100];
	
	//2 0~100の乱数の格納
	for(int i = 0; i < intArray.length; i++) {
		intArray[i] = new java.util.Random().nextInt(101);
	}
	
	//配列の中身を表示
	for(int i = 0; i < intArray.length; i++) {
		System.out.print(intArray[i] + " ");
	}
	System.out.println("");
	
	//3 合計値を表示する
	int sum = 0;
	for(int i = 0; i < intArray.length; i++) {
		//配列の要素をひとつずつ取り出してsumに足す
		sum += intArray[i];
	}
	System.out.println("合計値は" + sum + "です。");
	
	//4 平均を表示する
	int average = sum / intArray.length;
	System.out.println("平均は" + average + "です。");
	
	//チャレンジ問題
	//最大値
	int max = intArray[0];
	for(int i = 0; i < intArray.length; i++) {
		if(intArray[i] > max) {
			//もし変数maxよりも大きい数字が配列から出てこれば最大値を更新する
			max = intArray[i];
		}
	}
	System.out.println("最大値は" + max + "です。");
	
	//最小値
	int min = intArray[0];
	for(int i = 0; i < intArray.length; i++) {
		if(intArray[i] < min) {
			//もし変数minよりも小さい数字が配列から出てこれば最小値を更新する
			min = intArray[i];
		}
	}
	System.out.println("最小値は" + min + "です。");
	}
}
