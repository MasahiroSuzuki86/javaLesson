package lesson11;

/**
 * Creatureインターフェース
 * 実装した子クラスに
 * インターフェースが持っているメソッドを
 * オーバーライドさせるよう強制させることができる
 * （Creatureインターフェースを実装した子クラスは全てrunメソッドを持っていることが保証される）
 * @author suzukimasahiro
 *
 */
public interface Creature {
	
	/**
	 * インターフェース内のメソッドは自動的に
	 * publicかつ抽象クラスになる（省略可能）
	 */
	public abstract void run();

}
