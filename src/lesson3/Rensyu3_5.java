package lesson3;

public class Rensyu3_5 {
	public static void main(String[] args) {
		
		int temp = 30;
//		while (temp > 25) {
//			temp--;
//			System.out.println("温度を1度下げました");
//			System.out.println("現在の温度は：" + temp + "度です。");
//		}
		
		temp = 50;
		do {
			temp--;
			System.out.println("温度を1度下げました");
			System.out.println("現在の温度は：" + temp + "度です。");
		} while(temp > 25);
	}

}
