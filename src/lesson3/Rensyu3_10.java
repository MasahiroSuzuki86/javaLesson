package lesson3;

import java.util.Random;

public class Rensyu3_10 {
	public static void main(String[] args) {
		
		Random random = new java.util.Random();
		System.out.println("排出率0.1%のSSRが出るまでガチャを引きます。");
		System.out.println("1回引くのに300円です。");
		
		int i = 0;
		while(true) {
			int SSR;
			i++;
			SSR = random.nextInt(1000) + 1;
			
			if(SSR == 777) {
				System.out.println("SSRが出ました！");
				System.out.println(i + "回目のガチャです。");
				System.out.println((300 * i) + "円かかりました");
				break;
			}
			
		}
	}
}
