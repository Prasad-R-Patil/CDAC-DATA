package collections;

public class Movie implements Comparable<Movie>{
	private String title;
	private int year;
	public Movie() {
		title = "Drishyam 2";
		year = 2022;
	}
	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + "]";
	}
	@Override
	public int compareTo(Movie secondMovie) {
		// This method is used to provide the default sorting algorithm
		//E.g. Right now it is title wise Descending
		String title1 = title;//this.title;
		String title2 = secondMovie.title;
		int comparison = title2.compareTo(title1);//Results into Descending Order 
		//int comparison = title1.compareTo(title2);//Results into Ascending Order
		if(comparison == 0)
			comparison = 1;
		return comparison;
	}
	

}






