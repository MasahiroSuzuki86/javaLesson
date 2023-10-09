package lesson10;

public class Hero {
	static int cnt = 0;
	String name = "ミナト";
	int hp = 100;
	
	public Hero() {
		this.name = "ミナト";
		this.hp = 100;
	}
	
	public Hero(String name) {
		this.name = name;
	}
	
	// 戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");
	}
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	
	//finalがついているとオーバーライド（上書き）できない
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}
	
	

}
