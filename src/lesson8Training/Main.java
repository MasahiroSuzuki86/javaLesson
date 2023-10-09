package lesson8Training;

import java.util.Random;

public class Main {
	public static void main(String args[]) {
		
		//ガンダムを生成
		RX_78_2 gundom = new RX_78_2("ガンダム");
//		Pilot pilot = new Pilot();
//		pilot.name = "アムロ";
//		
//		gundom.name = "ガンダム";
//		gundom.armor = 300;
//		gundom.hp = 600;
//		gundom.mobility = 10;
//		gundom.pilot = pilot;
		
		//ザクを生成
		ZAKU_2 zaku = new ZAKU_2();
		zaku.name = "ザクⅡ";
		zaku.armor = 2;
		zaku.hp = 200;
		zaku.mobility = 3;
		
		battle(gundom, zaku);
		
//		//作ったメソッドをテストしてみる
//		System.out.println(gundom.name + "、武装のテストを開始します。");
//		gundom.beamRifle(zaku);
//		gundom.beamSaber(zaku);
//		gundom.headVulcan(zaku);
//		gundom.hyperBaz(zaku);
	}
	
	/**
	 * バトルメソッド
	 * ガンダムとザクを戦わせる
	 * @param gundom
	 * @param zaku
	 */
	public static void battle(RX_78_2 gundom, ZAKU_2 zaku) {
		System.out.println("=====================戦闘開始=====================");
		Random rand = new Random();
		while(gundom.hp > 0 && zaku.hp > 0 ) {
			int randomNum = rand.nextInt(4);
			if(randomNum == 3) {
				gundom.beamRifle(zaku);
			} else if(randomNum == 2) {
				gundom.hyperBaz(zaku);
			} else if(randomNum == 1) {
				gundom.beamSaber(zaku);
			} else {
				gundom.headVulcan(zaku);
			}
			
			if(zaku.hp < 1) {
				System.out.println(zaku.name + "のHPが0になりました。");
				System.out.println(gundom.name + "の勝利！");
				break;
			}
			
			zaku.machinegun(gundom);
			if(gundom.hp < 1) {
				System.out.println(gundom.name + "のHPが0になりました。");
				System.out.println(zaku.name + "の勝利！");
			}
		}
	}
	
}
