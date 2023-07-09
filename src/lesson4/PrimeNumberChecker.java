package lesson4;

/**
 * 入力された数字が素数かどうかチェックするクラス
 * @author suzukimasahiro
 *
 */
public class PrimeNumberChecker {
	public static void main(String[] args) {
		
		System.out.println("素数かどうか判定します。");
		System.out.print("半角数字を入力してください：");
		//数字を入力させる
		int num = new java.util.Scanner(System.in).nextInt();
		
		//素数判定用のFlg
		boolean flg = true;
		
		if(num <= 1) {
			//１以下は素数ではない
			flg = false;
		} else {
			//2から入力された数字までに割り切れたら素数ではない
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					flg = false;
					System.out.println(i + "で割り切れました。");
					break;
				}
			}
		}
		
		if(flg) {
			System.out.println("入力した数字：" + num + "は素数です。");
		} else {
			System.out.println("入力した数字：" + num + "は素数ではありません。");
		}
	}
}
