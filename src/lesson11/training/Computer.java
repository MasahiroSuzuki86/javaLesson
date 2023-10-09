package lesson11.training;

/**
 *　コンピューター
 * @author suzukimasahiro
 *
 */
public class Computer extends TangibleAsset{
	String makerName;
	
	public Computer(String name, int price, String color, String makerName) {
		//親クラスのコンストラクタ呼び出し
		super(name, price, color);
		this.makerName = makerName;
	}
	
	public String getMakerName() {
		return this.makerName;
	}
}
