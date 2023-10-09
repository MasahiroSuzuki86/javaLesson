package lesson5;

/**
 * 教科書P202 5-7
 * @author suzukimasahiro
 *
 */
public class Rensyu5_7 {
	public static void main(String[] args) {
		//addメソッドを呼び出す
		int ans = add(100, 10);
		System.out.println("100 + 10 = " + ans);
	}
	
	public static int add(int x, int y) {
		int ans = x + y;
		//ansを戻り値として呼び出し元に返す
		return ans;
	}

}
