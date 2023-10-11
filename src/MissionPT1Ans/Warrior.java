package MissionPT1Ans;

import java.util.Random;

/**
 * MissionPT1サンプルコード
 * Warriorクラス
 * @author suzukimasahiro
 *
 */
public class Warrior extends Character {
	
	/* 運 */
	private int luck;
	
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
	
	public void tatsumakiSlash(Character character) {
		System.out.println(this.getName() + "の竜巻斬り！");
		//減らすHPの計算をする
		int attack =(int)(this.getAp() * 1.5);
		attack -= character.getDp();
		if(attack < 0) {
			attack = 0;
		}
		//乱数の生成
		Random random = new Random();
		int ranNum = random.nextInt(100) + 1;
		
		//乱数よりもluckが大きければさらに1.5倍
		if(this.luck > ranNum) {
			attack = (int)(attack * 1.5);
			System.out.println("クリティカルHit!");
		}
		
		//減らしたあとのHP計算
		int afterHp = character.getHp() - attack;
		if(afterHp < 0) {
			afterHp = 0;
		}
		
		//減らしたあとのHPを引数のHPにセットする
		character.setHp(afterHp);
		
		System.out.println(character.getName() + "に" + attack + "のダメージ！");
		System.out.println(character.getName() + "のHP、残り" + character.getHp() + "。");
	}

	/**
	 * @return luck
	 */
	public int getLuck() {
		return luck;
	}

	/**
	 * @param luck セットする luck
	 */
	public void setLuck(int luck) {
		this.luck = luck;
	}

	
}
