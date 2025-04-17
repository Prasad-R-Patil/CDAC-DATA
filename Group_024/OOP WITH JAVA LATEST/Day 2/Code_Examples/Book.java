
public class Book {
	private String title;
	private float price;
	private int pages;
	
	public Book() {//This is a no-argument constructor
		//Code to initialize the fields
		title = "Java Complete Reference";
		price = 875.75f;
		pages = 1034;
	}
	
	
	public Book(String title, float price, int pages) {
		//This is a 3 parameterized constructor
		this.title = title;
		this.price = price;
		this.pages = pages;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	

}
