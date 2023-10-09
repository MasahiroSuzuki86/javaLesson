package MissionPT1Ans;

/**
 * 全てのキャラクターのスーパークラス
 * @author suzukimasahiro
 *
 */
public abstract class Character {
	
	/* 名前 */
	String name;
	/* HP */
	int hp;
	
	/**
	 * キャラクターを攻撃するためのクラス
	 * @param character
	 */
	public abstract void attack(Character character);
}