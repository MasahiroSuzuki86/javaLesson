package lesson8;

/**
 * 第8章実行クラス
 * @author suzukimasahiro
 *
 */
public class Main {
	/**
	 * メインメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		//勇者よ、この仮想世界に生まれよ！
		Hero h = new Hero("みなと", 100);
		//フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		
		Hero h2 = new Hero();
		Hero h3 = new Hero();
		
		h3.hp = 0;
		
		
//		System.out.println("勇者" + h.name + "を生み出しました！");
//		
//		//勇者のメソッドを呼び出してゆく
//		h.sit(5);
//		h.slip();
//		h.sit(25);
//		h.run();
		
		//お化けキノコよ、この仮想世界に生まれよ！
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		h.slip();
		m1.run();
		m2.run();
		h.run();
		
		//勇者よ、戦え！
		//お化けキノコよ、逃げろ！
	}
}
