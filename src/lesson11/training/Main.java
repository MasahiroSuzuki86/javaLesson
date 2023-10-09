package lesson11.training;

public class Main {
	public static void main(String[] args) {
		//本クラスをインスタンス化する
		Book b = new Book("桃太郎", 100, "ピンク", "桃から生まれた桃太郎");
		
		String returnIsbn = b.getIsbn();
		System.out.println(returnIsbn);
		
		String returnName = b.getName();
		System.out.println(returnName);
		
		//コンピューターをインスタンス化する
		Computer p = new Computer("MacBookPro", 100000, "シルバー", "アップル");
		
		
	}
}
