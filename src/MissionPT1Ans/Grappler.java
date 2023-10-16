package MissionPT1Ans;

/**
 * MissionPT1サンプルコード
 * Grapplerクラス
 * @author suzukimasahiro
 *
 */
public class Grappler extends Character {
	
	/* 集中力 */
	private int concentration;
	
	/**
	 * 引数のキャラクタークラスに攻撃してHPを減らすメソッド
	 */
	@Override
	public void attack(Character character) {
		//減らす値は攻撃力から引数の防御力を減らした値
		int attack = this.getAp() - character.getDp();
		//０未満は０
		if(attack < 0) {
			attack = 0;
		}
		//減らしたあとのHPを計算する
		int afterHp = character.getHp() - attack;
		//０未満は０
		if(afterHp < 0) {
			afterHp = 0;
		}
		//減らしたあとのHPを引数のキャラクター変数にセットする
		character.setHp(afterHp);
		
		System.out.println(this.getName() + "の攻撃！");
		System.out.println(character.getName() + "に" + attack + "のダメージ！");
		System.out.println(character.getName() + "のHP、残り" + character.getHp() + "。");
	}
	
	/**
	 * 踵落とし
	 * 引数のキャラクターからHPを減らす
	 * @param character
	 */
	public void heelDrop(Character character) {
		System.out.println(this.getName() + "の踵落とし！");
		
		//ダメージ計算
		int damage = (int)(this.getAp() * 0.8);
		if(damage < 0) {
			damage = 0;
		}
		//残りHPの計算
		int afterHp = character.getHp() - damage;
		System.out.println(character.getName() + "に" + damage + "のダメージ！");
		
		//集中力が10以上なら追加ダメージ
		if(this.getConcentration() >= 10) {
			afterHp -= damage;
			System.out.println(this.getName() + "は集中している。追加攻撃！");
			System.out.println(character.getName() + "に" + damage + "のダメージ！");
		}
		//減らした後のHPをセット
		character.setHp(afterHp);
		System.out.println(character.getName() + "のHP、残り" + character.getHp() + "。");
		
		//concentrationから5を減らす
		int aftConcentration = this.getConcentration() - 5;
		if(aftConcentration < 0) {
			aftConcentration = 0;
		}
		//concentrationに計算した値をセット
		this.setConcentration(aftConcentration);
		
	}

	/**
	 * @return concentration
	 */
	public int getConcentration() {
		return concentration;
	}

	/**
	 * @param concentration セットする concentration
	 */
	public void setConcentration(int concentration) {
		this.concentration = concentration;
	}
	
	
}
