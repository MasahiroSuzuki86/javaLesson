package lesson12;

/**
 * マタンゴクラス
 * @author suzukimasahiro
 *
 */
public class Matango {
	
	/** 体力 */
	int hp;
	
	/** レベル */
	final int LEVEL = 10;
	
	/** サフィックス */
	char suffix;
	
	/**
	 * 逃げるメソッド
	 */
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}

}
