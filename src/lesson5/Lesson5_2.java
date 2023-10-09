package lesson5;

public class Lesson5_2 {
	public static void main(String[] args) {
		int bottom = 50;
		int high = 100;
		int volumeHigh = 10;
		
		int area = triangleArea(bottom, high);
		int volume = triangleVolume(area, volumeHigh);
		
		System.out.println("三角形の面積は" + area + "です。");
		System.out.println("三角柱の体積は" + triangleVolume(area, volumeHigh) + "です。");
	}
	
	public static int triangleArea(int bottom, int high) {
		int ans = bottom * high / 2;
		
		return ans;
	}
	
	public static int triangleVolume(int area, int high) {
		int ans = area * high;
		
		return ans;
	}

}
