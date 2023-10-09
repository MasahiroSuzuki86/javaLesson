package lesson10;

public class Main {
	public static void main(String[] args) {
		
		//ヒーロークラスをインスタンス化
		Hero h = new Hero();
		//ヒーロークラスのrun()を呼び出す
		h.run();
		
		//スーパーヒーロークラスをインスタンス化
		SuperHero sh = new SuperHero();
		
		//スーパーヒーロークラスはヒーロークラスを継承しているので
		//ヒーロークラスのメソッドrun()を呼び出せる
		sh.run();
		
	}

}
