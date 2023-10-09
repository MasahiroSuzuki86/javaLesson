package lesson11;

/**
 * Characterクラスを継承したDancerクラス
 * @author suzukimasahiro
 *
 */
public class Dancer extends Character {
	
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}

	/**
	 * 抽象メソッドであるattackメソッドをオーバーライド
	 * Characterクラスで抽象メソッドのattackメソッドがあるので
	 * 必ずattackメソッドを定義しないとエラーとなる。
	 * ただしDancerクラス自体を抽象クラスとして作ればエラーとならない（さらに子クラスでオーバーライドすればOK）
	 */
	@Override
	public void attack(Matango m) {	
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}

}
