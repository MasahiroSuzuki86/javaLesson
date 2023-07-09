package lesson3;

import java.util.Scanner;

public class Rensyu1 {
	public static void main(String[] args) {
		
			//Scannerの準備
			Scanner scanner = new Scanner(System.in);
			
			//メッセージの表示
			System.out.println("今日の天気を入力してください");

			//天気を入力させる
			String tenki = scanner.nextLine();
			if(tenki.equals("晴れ")) {
				//天気が晴れの場合
				System.out.println("散歩に行く");
			} else {
				//天気が晴れ以外の場合
				System.out.println("ゲームをする");
			}
			
			//メッセージの表示
			System.out.println("気温を入力してください");
			
			//気温を入力させる
			int kion = scanner.nextInt();

			if(kion >= 20 && kion <= 26) {
				//kionが20以上かつ26以下の場合
				System.out.println("過ごしやすい気温ですね");
			} else {
				//kionが20以上かつ26以下以外の場合
				System.out.println("体調に気をつけてくださいね");
			}
			
			//Scannerの破棄
			scanner.close();
	}

}
