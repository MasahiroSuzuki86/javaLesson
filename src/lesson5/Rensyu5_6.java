package lesson5;

public class Rensyu5_6 {
	public static void main(String[] args) {
		//xとyのスコープはmainメソッドの中だけ！他メソッドでは使えない！！！
		int x = 100;
		int y = 10;
		
		int area = triangleArea(x, y);
	}
	
	public static int triangleArea(int high, int bottom) {
		int area = bottom * high / 2;
		return area;
	}
	
	public static void add() {
		//addメソッドではxとyを宣言していないので使えない！！！
	/**	
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
		*/
	}

}
