package MissionPT1Ans;

import java.util.Random;

/**
 * 実行クラス
 * @author suzukimasahiro
 *
 */
public class Main {
	
	/* 特殊攻撃する割合の設定 */
	static final int SPECIAL_ATTACK = 45;
	
	public static void main(String[] args) {
		//Warriorクラスをインスタンス化して初期値をセット
		Warrior war = new Warrior();
		war.setAp(150);
		war.setDp(30);
		war.setHp(1500);
		war.setMp(20);
		war.setName("戦士たけし");
		war.setLuck(30);
		
		//Grapplerクラスをインスタンス化して初期値をセット
		Grappler gra = new Grappler();
		gra.setAp(150);
		gra.setDp(40);
		gra.setHp(1700);
		gra.setMp(0);
		gra.setName("格闘家まさき");
		gra.setConcentration(25);
		
		battle(war, gra);

	}
	
	/**
	 * 戦わせるメソッド
	 * @param war
	 * @param grp
	 */
	public static void battle(Warrior war, Grappler grp) {
		System.out.println("--------------------バトル開始--------------------");
		System.out.println(war.getName() + "VS" + grp.getName() + "!!!");
		
		//ターン数をカウントする変数
		int cnt = 0;
		//どちらかのHPが0以下になったら戦いをやめる
		while(war.getHp() > 0 && grp.getHp() > 0) {
			cnt++;
			System.out.println("--------------------" + cnt + "ターン目!!!" + "--------------------");
			//Warriorの攻撃
			if(reRandomNum() < SPECIAL_ATTACK) {
				war.tatsumakiSlash(grp);
			} else {
				war.attack(grp);
			}
			
			//HP0判定
			if(!judgeHp(grp)) {
				//Hpが0以下なら
				System.out.println(war.getName() + "の勝利！！！");
				break;
			}
			
			System.out.println("");
			
			//Grapplerの攻撃
			if(reRandomNum() < SPECIAL_ATTACK) {
				grp.heelDrop(war);
			} else {
				grp.attack(war);
			}
			
			//HP0判定
			if(!judgeHp(war)) {
				//Hpが0以下なら
				System.out.println(war.getName() + "の勝利！！！");
				break;
			}
		}
	}
	
	/**
	 * 1〜100の乱数を生成するメソッド
	 * @return
	 */
	public static int reRandomNum() {
		//乱数の生成
		Random random = new Random();
		int ranNum = random.nextInt(100) + 1;
		return ranNum;
	}
	
	/**
	 * HPを判定するメソッド
	 * @param cha
	 * @return
	 */
	public static boolean judgeHp(Character cha) {
		
		if(cha.getHp() < 1) {
			System.out.println(cha.getName() + "は倒れた。");
			return false;
		} else {
			return true;
		}
	}

}
