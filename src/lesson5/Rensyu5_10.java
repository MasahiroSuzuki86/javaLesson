package lesson5;

public class Rensyu5_10 {
	/**
	 * 実行メソッド
	 * @param args
	 */
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
		return x + y;
	}
	
	//２つめのaddメソッド
	public static double add(double x, double y) {
		return x + y;
	}
	
	//3つめのaddメソッド
	public static String add(String x, String y) {
		return x + y;
	}
	
	//4つめのaddメソッド
	public static int add(int x, int y, int z) {
		return x + y + z;
	}

}
