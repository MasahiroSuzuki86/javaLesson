package lesson10Training;

import java.util.Random;

import lesson8Training.Pilot;

public class MobileSuit {
	
	/** 名前 */
	public String name;
	
	/** HP */
	public int hp;
	
	/** 装甲 */
	public int armor;
	
	/**　機動性 */
	public int mobility;
	
	/** パイロット */
	public Pilot pilot;
	
	/**
	 * 引数無しコンストラクタ
	 */
	public MobileSuit() {
		Pilot pilot = new Pilot();
		this.pilot = pilot;
	}
	
	public MobileSuit(String name, int hp, int armor, int mobility, Pilot pilot) {

		this.name = name;
		this.hp = hp;
		this.armor = armor;
		this.mobility = mobility;
		this.pilot = pilot;
		
	}
	
	/**
	 * 命中判定メソッド
	 * @param mobility 敵の機動性
	 * @param accuracy 命中率
	 * @return result 命中判定
	 */
	public boolean hitJudge(int mobility, int accuracy) {
		//命中結果
		boolean result = false;
		//命中率から敵の機動性を引く
		accuracy = accuracy - mobility;
		
		//1~100の乱数生成
		Random rand = new Random();
		int randomNum = rand.nextInt(101) + 1;
		
		//命中率が乱数以上なら命中判定
		if(accuracy >= randomNum) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
	
	/**
	 * 命中時の処理
	 * 敵のHP減らしてメッセージを表示
	 * @param dameage
	 * @param zaku
	 */
	public void hitMessage(int dameage, MobileSuit ms) {
		ms.hp = ms.hp - dameage;
		if(ms.hp < 1) {
			ms.hp = 0;
		}
		System.out.println("命中！");
		System.out.println(ms.name + "に" + dameage + "のダメージ");
		System.out.println(ms.name + "のHPは残り" + ms.hp);
	}
	
	/**
	 * 命中時の処理（連続攻撃バージョン）
	 * 敵のHPを減らしてメッセージを表示
	 * @param dameage
	 * @param zaku
	 * @param cnt
	 */
	 public void hitMessage(int dameage, MobileSuit ms, int cnt) {
			ms.hp = ms.hp - dameage;
			if(ms.hp < 1) {
				ms.hp = 0;
			}
			if(dameage < 0) {
				dameage = 0;
			}
			
			System.out.println(cnt + "回命中！");
			System.out.println(ms.name + "に" + dameage + "のダメージ");
			System.out.println(ms.name + "のHPは残り" + ms.hp);
	 }

}
