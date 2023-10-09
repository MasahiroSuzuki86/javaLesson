package lesson8;

public class Main2 {
	public static void main(String[] args) {
		//剣をインスタンス化する
		Sword s = new Sword();
		s.name="炎の剣";
		s.damage = 10;
		
		//勇者をインスタンス化する
		Hero h = new Hero();
		h.name= "ミナト";
		h.hp = 100;
		//フィールドのswordにインスタンス化した剣を代入する
		h.sword = s;
		
		//↓のように剣のフィールドの変数を使うことができる
		System.out.println("現在の武器は" + h.sword.name);
		System.out.println("武器の攻撃力は" + h.sword.damage);
	}
}
