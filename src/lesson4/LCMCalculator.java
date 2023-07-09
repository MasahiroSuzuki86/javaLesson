package lesson4;

public class LCMCalculator {
	public static void main(String[] args)  {
		
		System.out.println("２つの数字の最小公倍数と最大公約数を求めます。");
		System.out.print("１つめの数字を入力してください：");
		int num1 = new java.util.Scanner(System.in).nextInt();
		int tmp1 = num1;
		
		System.out.print("２つめの数字を入力してください：");
		int num2 = new java.util.Scanner(System.in).nextInt();
		int tmp2 = num2;
		
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
		//最大公約数
		int gcd = num1;
		//最小公倍数は二つの数をかけたものを最大公約数で割った数
		int lcs = (tmp1 * tmp2) / gcd;
		
		System.out.println("最大公約数：" + gcd);
		System.out.println("最小公倍数：" + lcs);
	}
}
