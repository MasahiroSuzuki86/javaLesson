package MissionPT1Ans;

/**
 * 全てのキャラクターのスーパークラス
 * @author suzukimasahiro
 *
 */
public abstract class Character {
	
	/* 名前 */
	private String name;
	/* HP */
	private int hp;
	/*　攻撃力 */
	private int ap;
	/* 防御力 */
	private int dp;
	/* 魔力 */
	private int mp;
	
	/**
	 * キャラクターを攻撃するためのクラス
	 * @param character
	 */
	public abstract void attack(Character character);

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp セットする hp
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * @return ap
	 */
	public int getAp() {
		return ap;
	}

	/**
	 * @param ap セットする ap
	 */
	public void setAp(int ap) {
		this.ap = ap;
	}

	/**
	 * @return dp
	 */
	public int getDp() {
		return dp;
	}

	/**
	 * @param dp セットする dp
	 */
	public void setDp(int dp) {
		this.dp = dp;
	}

	/**
	 * @return mp
	 */
	public int getMp() {
		return mp;
	}

	/**
	 * @param mp セットする mp
	 */
	public void setMp(int mp) {
		this.mp = mp;
	}
	
}