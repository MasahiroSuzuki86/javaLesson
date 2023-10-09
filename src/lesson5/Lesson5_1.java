package lesson5;

import java.util.Scanner;

public class Lesson5_1 {
	public static void main(String[] args) {
		//Scannerの準備
		System.out.println("名前を入力してください");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		//メソッドの呼び出し
		printName(name);
	}
	
	/**
	 * 名前を引数として受け取り、メッセージを表示するメソッド
	 * @param name
	 */
	public static void printName(String name) {
		System.out.println(name + "さん、こんにちは！");
	}

}
