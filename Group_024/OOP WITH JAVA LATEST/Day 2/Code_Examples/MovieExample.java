
public class MovieExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating 2 Movie Objects
		Movie firstMovie = new Movie();
		Movie secondMovie = new Movie();
		
		//Assigning values for firstMovie
		firstMovie.movieId = "M01";
		firstMovie.movieTitle = "Life of PI";
		firstMovie.movieGenre = "Emotional";
		firstMovie.movieDuration = 125;
		
		//Apply the same logic for assigning values for secondMovie
		
		//Retrieving values from firstMovie
		String firstId = firstMovie.movieId;
		System.out.println("ID of the first movie: " + firstId);
		System.out.println("Title of the first movie: " + firstMovie.movieTitle);
		//Apply the same logic for fetching values of other properties

	}

}







