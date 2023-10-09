package lesson11;

/**
 * 抽象クラス
 * newできない継承専用のクラス
 * @author suzukimasahiro
 *
 */
public abstract class Character {
	
	String name;
	int hp;
	
	/**
	 * オーバーライドの強制
	 * オーバーライドしないとエラーとなる
	 * @param m
	 */
	public abstract void attack(Matango m);

}
