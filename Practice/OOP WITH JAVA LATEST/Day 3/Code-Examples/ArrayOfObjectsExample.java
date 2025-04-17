
public class ArrayOfObjectsExample {
	
	private static String[] getBookNamesWithPagesLessThan1000(Book booksArray[]) {
		int size = booksArray.length;
		String bookNames[] = new String[size];
		int index = 0;
		for(Book bk : booksArray) {
			int pages = bk.getPages();
			if(pages < 1000) {
				String name = bk.getTitle();
				bookNames[index] = name;
				index++;
			}
		}
		return bookNames;
	}

	public static void main(String[] args) {
		Book books[] = new Book[3];
		books[0] = new Book("Java", 500, 1000);
		books[1] = new Book("Python", 475, 800);
		books[2] = new Book("Angular", 400, 700);
		
		for(Book bk : books) {
			System.out.println(bk.getTitle());
		}
		
		System.out.println("-------------------");
		
		String names[] = getBookNamesWithPagesLessThan1000(books);
		for(String name : names) {
			if(name != null)
			System.out.println(name);
		}

	}

}
