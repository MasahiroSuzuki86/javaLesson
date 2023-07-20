package lesson5;

public class Rensyu5_4 {
	public static void main(String[] args) {
		String name = "ああああああ";
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		hello("菅原");
		System.out.println("メソッドの呼び出しが終わりました");
		System.out.println(name);
	}

	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
}
