package lesson2;

import java.util.Random;
import java.util.Scanner;

/**
 * 教科書P96.練習２−３
 * @author suzukimasahiro
 *
 */
public class Question2_3 {
	public static void main(String[] args) {
		
		//Scannerの準備
		Scanner scanner = new Scanner(System.in);
		//Randomの準備
		Random random = new java.util.Random();
		
		//①
		System.out.println("ようこそ占いの館へ");
		//②
		System.out.println("あなたの名前を入力してください。");
		//③
		String name = scanner.nextLine();
		//④
		System.out.println("あなたの年齢を入力してください。");
		//⑤
		String ageString = scanner.nextLine();
		//⑥
		int age = Integer.parseInt(ageString);
		//⑦
		int fortune = random.nextInt(4);
		//⑧
		fortune++;
		//⑨
		System.out.println("占いの結果が出ました！");
		//⑩
		System.out.println(age + "歳の" + name + "さん、" + "あなたの運気番号は" + fortune + "です");
		//11
		System.out.println("1:大吉2:中吉3:吉4:凶");
		
		//Scannerの破棄
		scanner.close();
	}
}
