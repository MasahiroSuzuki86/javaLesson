package lesson11;

/**
 * Humanインターフェース
 * Creatureインターフェースを継承したインターフェース
 * Creatureインターフェースが持つ抽象メソッドを持っている
 * @author suzukimasahiro
 *
 */
public interface Human extends Creature{
	
	void talk();
	void watch();
	void hear();
	
	//さらに親インターフェースからrun()を継承している

}
