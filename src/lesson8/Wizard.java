package lesson8;

public class Wizard {
	String name;
	int hp;
	
	//引数の勇者インスタンスのhpを10増やすメソッド
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}
}
