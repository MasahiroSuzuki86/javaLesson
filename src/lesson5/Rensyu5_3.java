package lesson5;

public class Rensyu5_3 {
	
	/**
	 * メインメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		methodA();
	}
	
	/**
	 * メソッドA
	 * メソッドBを呼び出すメソッド
	 */
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	
	/**
	 * メソッドB
	 */
	public static void methodB() {
		System.out.println("methodB");
	}

}
