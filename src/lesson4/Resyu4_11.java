package lesson4;

public class Resyu4_11 {
	public static void main(String[] args) {
		int [] scores = {20, 30, 40, 50, 80};
		int [] scores2 = scores.clone();
		
		System.out.println(scores[0]);
		
		for(int i = 0; i < scores2.length; i++) {
			System.out.println(scores2[i]);
		}
		
		int count = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は：" + count);
	} 
}
