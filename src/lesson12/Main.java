package lesson12;

public class Main {
	public static void main(String[] args) {
		
		Wizard w = new Wizard();
		Character c = w;
		Matango m = new Matango();
		c.name = "アサカ";
		//c.attack(m);
		
		//ざっくりキャラクタークラスとして捉えると
		//ウィザードクラス独自のメソッドは呼び出せなくなる
		//フィールドやメソッドは変数のクラスに依存する
		//c.fireball(m);
	}
}