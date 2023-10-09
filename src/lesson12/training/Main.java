package lesson12.training;

public class Main {
	public static void main(String[] args) {
		
		//①Aクラス、Bクラスのインスタンスを生み出す
		A a = new A();
		B b = new B();
		
		//②要素数２の配列を作る
		//単一とのことなのでざっくり捉える
		//AとBはYを継承しているのでYとザックリ捉える配列を作る
		Y[] array = new Y[2];
		
		//③配列にaとbのインスタンスを格納
		array[0] = a;
		array[1] = b;
		
		//④配列の中身をループ順で取り出し、それぞれのbメソッドを呼び出す
		for(int i = 0; i < array.length; i++) {
			array[i].b();
		}
		
	}

}
