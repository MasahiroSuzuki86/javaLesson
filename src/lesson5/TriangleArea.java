package lesson5;

public class TriangleArea {
	
	/**
	 * 実行メソッド
	 * @param args
	 */
	public static void main(String[] args) {
		
		//三角形の面積を求める
		int bottom = 566;
		int high = 112;
		tiangleArea(bottom, high);
		
	}
	
	/**
	 * 引数２つ int型　底辺、高さ
	 */
	public static void tiangleArea(int bottom, int high) {
		
		//三角形の面積を求める
		int ans = bottom * high / 2;
		
		//求めた三角形の面積を表示する
		System.out.println("底辺:" + bottom + " " + "高さ:" + high + " "
				+ "の三角形の面積は" + ans + "です。");
		
		//求めた三角形の三角柱の体積を求める
		int volumeHigh = 56;
		triangleVolume(ans, volumeHigh);
	}
	
	/**
	 * 面積と高さから三角柱の体積を求めるメソッド
	 * @param area
	 * @param volumeHigh
	 */
	public static void triangleVolume(int area, int volumeHigh) {
		int ans = area * volumeHigh;
		System.out.println("高さが" + volumeHigh + "だとすると、三角柱の体積は：" + ans + "です。");
	}
}
