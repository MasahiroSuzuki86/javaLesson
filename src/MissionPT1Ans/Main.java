package MissionPT1Ans;

/**
 * 実行クラス
 * @author suzukimasahiro
 *
 */
public class Main {
	public static void main(String[] args) {
		Warrior yositaka = new Warrior();
		yositaka.setAp(40);
		yositaka.setDp(40);
		yositaka.setHp(1000);
		yositaka.setLuck(10);
		yositaka.setMp(0);
		yositaka.setName("よしたか");
		
		System.out.println(yositaka.getName());
		yositaka.setName("スーパーよしたか");
		System.out.println(yositaka.getName());
		
		
		Warrior takeshi = new Warrior();
		takeshi.setDp(5);
		takeshi.setHp(100);
		takeshi.setName("たけし");
		
		yositaka.attack(takeshi);
	}

}
