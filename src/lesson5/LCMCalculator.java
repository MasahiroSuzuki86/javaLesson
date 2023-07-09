package lesson5;

public class LCMCalculator {
	public static void main(String[] args)  {
		
		System.out.println("２つの数字の最小公倍数と最大公約数を求めます。");
		System.out.print("１つめの数字を入力してください：");
		//計算用変数
		int num1 = new java.util.Scanner(System.in).nextInt();
		//保存用変数
		int tmp1 = num1;
		
		System.out.print("２つめの数字を入力してください：");
		//計算用変数
		int num2 = new java.util.Scanner(System.in).nextInt();
		//保存用変数
		int tmp2 = num2;
		
		//最大公約数を求める
		int gcd = getGcd(num1, num2);
		//最小公倍数を求める
		int lcs = getlcs(tmp1, tmp2, gcd);
		
		System.out.println("最大公約数：" + gcd);
		System.out.println("最小公倍数：" + lcs);
	}
	
	/**
	 * 最大公約数を求めて返すメソッド
	 * @param num1 数字１
	 * @param num2 数字２
	 * @return 最大公約数
	 */
	public static int getGcd(int num1, int num2) {
		//ユークリッドの互除法で最大公約数を求める
		//余りが0になったらループ終了
		while(num2 != 0) {
			int temp = num2;
			System.out.print(num1 + " ÷ " + num2 + " の余り：");
			//余りを求めて次の割る数に代入
			num2 = num1 % num2;
			System.out.println(num2);
			//割った数を次の割られる数に代入
			num1 = temp;
		}
		
		return num1;
	}
	
	/**
	 * 最小公倍数を求めて返すメソッド
	 * @param tmp1 数字１
	 * @param tmp2 数字２
	 * @param gcd  最小公約数
	 * @return lcs 最小公倍数
	 */
	public static int getlcs(int tmp1, int tmp2, int gcd) {
		int lcs = (tmp1 * tmp2) / gcd;
		return lcs;
	}
}
