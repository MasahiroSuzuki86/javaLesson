package lesson11.training;

/**
 * 本
 * @author suzukimasahiro
 *
 */
public class Book extends TangibleAsset {
	String isbn;
	
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	
	//isbnのゲッター
	//フィールドのisbnを返す
	public String getIsbn() {
		return this.isbn;
	}
}
