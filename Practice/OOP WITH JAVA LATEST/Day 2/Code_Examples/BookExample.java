
public class BookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		Book b2 = new Book("Let us C", 400, 200);
		//b1.setTitle("Let us C");
		//b1.setPrice(590.50f);
		//b1.setPages(300);
		
		//Get and print the values
		System.out.println(b1.getTitle());
		System.out.println(b1.getPrice());
		System.out.println(b1.getPages());

	}

}
