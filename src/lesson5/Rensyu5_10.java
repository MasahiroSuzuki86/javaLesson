	package lesson5;

public class Rensyu5_10 {
	/**
	 * 実行メソッド
	 * @param args
	 */
	
	//オーバーロード (多重定義）
	public static void main(String[] args) {
		//ひとつめのaddメソッドが呼び出される
		System.out.println(add(10, 20));
		
		//ふたつめのaddメソッドが呼び出される
		System.out.println(add(3.5, 2.7));
		
		//みっつめのaddメソッドが呼び出される
		System.out.println(add("Hello", "World"));
		
		//4つめのaddメソッドが呼び出される
		System.out.println(add(10, 20, 30));
	}
	
	//メソッドは基本的に同じ名前で定義できないが・・・？
	//引数の型、数が異なれば複数定義できる！
	
	//1つめのaddメソッド
	public static int add(int x, int y) {
		System.out.println("ひとつめ");
		return x + y;
	}
	
	//２つめのaddメソッド
	public static double add(double x, double y) {
		System.out.println("ふたつめ");
		return x + y;
	}
	
	//3つめのaddメソッド
	public static String add(String x, String y) {
		System.out.println("みっつめ");
		return x + y;
	}
	
	//4つめのaddメソッド
	public static int add(int x, int y, int z) {
		System.out.println("よっつめ");
		return x + y + z;
	}

}
