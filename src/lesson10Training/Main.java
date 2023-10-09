package lesson10Training;

public class Main {
	public static void main(String[] args) {
		
		RX_78_2 g1 = new RX_78_2();
		RX_78_2 g2 = new RX_78_2();
		
		MobileSuit m2 = g2;
		g1.beamRifle(m2);
		
		g2 = (RX_78_2)m2;
		
	}
}
