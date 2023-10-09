package lesson10;

public class SuperHero extends Hero {
	
	//Heroクラスを継承しているので書いてないけどname,hpを持っている
	boolean flying;
	
	public SuperHero(String name) {
		super(name);
		this.flying  = false;
	}
	
	public SuperHero() {
		
	}
	
	//Heroクラスを継承しているので書いてないけどrun()とattack()メソッドを持っている
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	
	//オーバーライド（再定義）同じ名前、引数のメソッドを再定義する
	@Override
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	
	@Override
	public void attack(Matango m) {
		super.attack(m);
		if(this.flying) {
			super.attack(m);
		}
	}
	
	//slip()はHeroクラスでfinalがついているのでオーバーライドできない。
	
//	public void slip() {
//		
//	}
}
