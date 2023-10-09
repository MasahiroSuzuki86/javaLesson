package lesson5;

/**
 * 教科書P203 5-8
 * @author suzukimasahiro
 *
 */
public class Rensyu5_8 {
	public static void main(String[] args) {
		//addメソッドの戻り値をそのままaddメソッドで使用する例（あまり使わないけど・・・）
		System.out.println(add(add(10, 20), add(30, 40)));
	}
	
	/**
	 * x と yを足し算すメソッド
	 * @param x
	 * @param y
	 * @return
	 */
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}

}
