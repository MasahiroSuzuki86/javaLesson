package lesson6.main;
//import文でパッケージ名.クラス名を書く
import lesson6.logics.CalcLogic;

public class Calc {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		//クラスをimportすると別のパッケージのメソッドをクラス名.メソッド名で呼び出せる。
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		//同じパッケージのクラスはimportしなくてもメソッドをクラス名.メソッド名で呼び出せる。
		int kakeru = Sample1.kakeru(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
		System.out.println("かけると" + kakeru);
	}
}
