package lesson5;

public class Rensyu5_3 {
	
	/**
	 * メインメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		methodA();
		System.out.println("methodAを呼び出しました。");
	}
	
	/**
	 * メソッドA
	 * メソッドBを呼び出すメソッド
	 */
	public static void methodA() {
		System.out.println("methodA");
		methodB();
		System.out.println("methodBを呼び出しました。");
	}
	
	/**
	 * メソッドB
	 */
	public static void methodB() {
		System.out.println("methodB");
	}

}
