package lesson5;

public class Rensyu5_12 {
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		printArray(array);
		
	}
	
	public static void printArray(int[] array) {
		
		/**
		 * 拡張for文
		 */
		for(int element : array) {
			System.out.println(element);
		}
		
		/**
		 * 普通のfor文
		 */
//		for(int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
	}

}
