package lesson8;

/**
 * 勇者クラス
 * @author suzukimasahiro
 *
 */
public class Hero {
	/** 名前 */
	String name;
	
	/** 体力 */
	int hp;
	
	/** 剣 */
	Sword sword;
	
	/**
	 * コンストラクタ newされた直後に自動的に実行される。
	 */
	public Hero(String name, int hp) {
		//hpを100で初期化
		this.hp = hp;
		this.name = name;
	}
	
	public Hero(String name, int hp, Sword sword) {
		//別コンストラクタをコンストラクタ内で呼び出す
		this(name, hp);
		this.sword = sword;
	}
	
	public Hero() {
		this.hp = 100;
	}
	
	/**
	 * 眠る
	 * hpを100にするメソッド
	 */
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
	
	/**
	 * 座る
	 * 引数の秒数分HPを回復するメソッド
	 * @param sec 座る秒数
	 */
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HP" + sec + "ポイント回復した");
	}
	
	/**
	 * 滑るメソッド
	 * hpから5を引く
	 */
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	
	/**
	 * 逃げる
	 */
	public void run() {
		System.out.println(this.name + "は、逃げ出した");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
