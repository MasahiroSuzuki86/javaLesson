package lesson10Training;

import lesson8Training.Pilot;

/**
 *　ガンダムクラス
 *  MSクラスを継承している
 * @author suzukimasahiro
 *
 */
public class RX_78_2 extends MobileSuit {
	
//	/** 名前 */
//	public String name;
//	
//	/** HP */
//	public int hp;
//	
//	/** 装甲 */
//	public int armor;
//	
//	/**　機動性 */
//	public int mobility;
//	
//	/** パイロット */
//	public Pilot pilot;
	
	/**
	 * コンストラクタ
	 * 引数無し
	 */
	public RX_78_2() {
		this.name = "ガンダム";
		this.hp = 600;
		this.armor = 300;
		this.mobility = 10;
	}
	
	/**
	 * コンストラクタ
	 * @param pilot
	 */
	public RX_78_2(Pilot pilot) {
		this();
		this.pilot = pilot;
	}
	
	/**
	 * ビームライフル
	 * 威力50
	 * 命中75
	 * @param zaku
	 */
	public void beamRifle(MobileSuit ms) {
		boolean hitFlg = super.hitJudge(ms.mobility, 75);
		System.out.println(this.name + "のビームライフル!");
		//命中したらザクのHPを40 - 装甲分減らす
		if(hitFlg == true) {
			int dameage = 50 - ms.armor;
			super.hitMessage(dameage, ms);
		} else {
			System.out.println("ミス");
		}
	}

	/**
	 * ハイパーバズーカ
	 * 威力30
	 * 命中50
	 * @param zaku
	 */
	public void hyperBaz(MobileSuit ms) {
		System.out.println(this.name + "のハイパーバズーカ!");
		boolean hitFlg = super.hitJudge(ms.mobility, 50);
		
		if(hitFlg == true) {
			int dameage = 30 - ms.armor;
			super.hitMessage(dameage, ms);
		} else {
			System.out.println("ミス");
		}
	}
	
	/**
	 * ビームサーベル
	 * 装甲無視攻撃
	 * 威力 100
	 * 命中 80
	 * @param zaku
	 */
	public void beamSaber(MobileSuit ms) {
		System.out.println(this.name + "のビームサーベル!");
		boolean hitFlg = super.hitJudge(ms.mobility, 80);
		
		if(hitFlg == true) {
			int dameage = 100;
			super.hitMessage(dameage, ms);
		} else {
			System.out.println("ミス");
		}
	}
	
	/**
	 * 頭部バルカン
	 * 攻撃回数 5
	 * 威力 8
	 * 命中 70
	 * @param zaku
	 */
	public void headVulcan(MobileSuit ms) {
		System.out.println(this.name + "の頭部バルカン！");
		int dameage = 0;
		int cnt = 0;
		
		//５回攻撃
		for(int i = 0; i < 5; i++) {
			
			boolean hitFlg = super.hitJudge(ms.mobility, 70);
			
			if(hitFlg == true) {
				System.out.println("HIT!!!");
				cnt++;
				dameage += 8;
			}
		}
		
		dameage = dameage - ms.armor;
		if(dameage < 0 ) {
			dameage = 0;
		}
		super.hitMessage(dameage, ms, cnt);
	}
	
	/**
	 * 命中判定メソッド
	 * @param mobility 敵の機動性
	 * @param accuracy 命中率
	 * @return result 命中判定
	 */
	
	@Override
	public boolean hitJudge(int mobility, int accuracy) {
		
		
		
		return true ;
	}
	
//	/**
//	 * 命中判定メソッド
//	 * @param mobility 敵の機動性
//	 * @param accuracy 命中率
//	 * @return result 命中判定
//	 */
//	public boolean hitJudge(int mobility, int accuracy) {
//		//命中結果
//		boolean result = false;
//		//命中率から敵の機動性を引く
//		accuracy = accuracy - mobility;
//		
//		//1~100の乱数生成
//		Random rand = new Random();
//		int randomNum = rand.nextInt(101) + 1;
//		
//		//命中率が乱数以上なら命中判定
//		if(accuracy >= randomNum) {
//			result = true;
//		} else {
//			result = false;
//		}
//		
//		return result;
//	}
//	
//	/**
//	 * 命中時の処理
//	 * 敵のHP減らしてメッセージを表示
//	 * @param dameage
//	 * @param zaku
//	 */
//	public void hitMessage(int dameage, MobileSuit ms) {
//		ms.hp = ms.hp - dameage;
//		if(ms.hp < 1) {
//			ms.hp = 0;
//		}
//		System.out.println("命中！");
//		System.out.println(ms.name + "に" + dameage + "のダメージ");
//		System.out.println(ms.name + "のHPは残り" + ms.hp);
//	}
//	
//	/**
//	 * 命中時の処理（連続攻撃バージョン）
//	 * 敵のHPを減らしてメッセージを表示
//	 * @param dameage
//	 * @param zaku
//	 * @param cnt
//	 */
//	 public void hitMessage(int dameage, MobileSuit ms, int cnt) {
//			ms.hp = ms.hp - dameage;
//			if(ms.hp < 1) {
//				ms.hp = 0;
//			}
//			if(dameage < 0) {
//				dameage = 0;
//			}
//			
//			System.out.println(cnt + "回命中！");
//			System.out.println(ms.name + "に" + dameage + "のダメージ");
//			System.out.println(ms.name + "のHPは残り" + ms.hp);
//	 }

}
