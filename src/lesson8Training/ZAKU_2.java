package lesson8Training;

import java.util.Random;

/**
 * ザクⅡクラス
 * @author suzukimasahiro
 *
 */
public class ZAKU_2 {
	/** 機体の通称 */
	public String name;
	
	/** hp */
	public int hp;
	
	/** 馬力 */
	public int horsepower;
	
	/** ビーム出力 */
	public int beamPower;
	
	/** 装甲 */
	public int armor;
	
	/** 機動性 */
	public int mobility;
	
	/**
	 * ザクマシンガン
	 * 攻撃回数 15
	 * 威力 10
	 * 命中 60
	 * @param zaku
	 */
	public void machinegun(RX_78_2 gundom) {
		int dameage = 0;
		int cnt = 0;
		
		System.out.println(this.name + "のザクマシンガン！");
		for(int i = 0; i < 15; i++) {
			
			boolean hitFlg = hitJudge(gundom.mobility, 60);
			
			if(hitFlg == true) {
				System.out.println("HIT!!!");
				cnt++;
				dameage += 8;
			}
		}
		
		hitMessage(dameage, gundom, cnt);
		dameage = dameage - gundom.armor;
		if(dameage < 0) {
			dameage = 0;
		}
		gundom.hp = gundom.hp - dameage;
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
		accuracy -= accuracy - mobility;
		
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
	 * 命中時の処理（連続攻撃バージョン）
	 * 敵のHPを減らしてメッセージを表示
	 * @param dameage
	 * @param zaku
	 * @param cnt
	 */
	 public void hitMessage(int dameage, RX_78_2 gundom, int cnt) {
		 gundom.hp = gundom.hp - dameage;
			if(gundom.hp < 1) {
				gundom.hp = 0;
			}
			if(dameage < 0) {
				dameage = 0;
			}
			
			System.out.println(cnt + "回命中！");
			System.out.println(gundom.name + "に" + dameage + "のダメージ");
			System.out.println(gundom.name + "のHPは残り" + gundom.hp);
	 }
}
