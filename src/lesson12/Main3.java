package lesson12;

public class Main3 {
	public static void main(String[] args) {
		
		Character[] c = new Character[5];
		
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		
		/**
		 * 拡張for文で書く場合
		 * （書けるならこっちの方が楽）
		 */
		for(Character ch: c) {
			ch.hp += 50;
		}
		
		/**
		 * 普通のfor文
		 */
		for(int i = 0; i < c.length; i++) {
			c[i].hp += 50;
		}
	}

}
