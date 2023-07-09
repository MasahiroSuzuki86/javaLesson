package lesson4;

import java.util.Random;

public class Rensyu4_1 {
	public static void main(String args[]) {
		int[] scores;
		scores = new int[5];
		
		//Randomの準備
		Random random = new java.util.Random();
		for(int i = 0; i < scores.length; i++) {
			scores[i] = random.nextInt(999);
		}
		
		int max = 0;
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			if(max < scores[i]) {
				max = scores[i];
			} 
		}
		System.out.println("最大値は：" + max + " です。");
	}
}
