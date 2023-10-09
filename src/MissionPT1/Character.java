package MissionPT1;

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
	/*　攻撃力 */
	int ap;
	/* 防御力 */
	int dp;
	/* 魔力 */
	int mp;
	
	/**
	 * キャラクターを攻撃するためのクラス
	 * @param character
	 */
	public abstract void attack(Character character);
}