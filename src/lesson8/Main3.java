package lesson8;

public class Main3 {
	public static void main(String[] args) {
		//勇者ミナトを生み出す
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		
		//勇者アサカを生み出す
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		
		//魔法使がスガワラを生み出す
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		//魔法使いのhealメソッドで引数に入れた勇者インスタンスのHPを回復
		w.heal(h1);
		System.out.println(h1.hp);
		w.heal(h2);
		System.out.println(h2.hp);
		w.heal(h2);
		System.out.println(h2.hp);
	}
}
