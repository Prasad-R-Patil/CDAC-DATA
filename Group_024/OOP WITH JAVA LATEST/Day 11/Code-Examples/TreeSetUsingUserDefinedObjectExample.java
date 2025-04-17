package collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetUsingUserDefinedObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Movie> comp1 = new MovieComparatorYearWiseAscending();
		Comparator<Movie> comp2 = new MovieComparatorYearWiseDescending();
		//SortedSet<Movie> allMovies = new TreeSet<Movie>(); //Uses Default Sorting Algorithm
		SortedSet<Movie> allMovies = new TreeSet<Movie>(comp2);
		//In the above statement, customized sorting algorithm is used which is given by either comp1 or comp2
		Movie m1 = new Movie();
		Movie m2 = new Movie("Speed", 1997);
		Movie m3 = new Movie("Predator", 1990);
		Movie m4 = new Movie("Lagaan", 2000);
		Movie m5 = new Movie("PK", 2014);
		allMovies.add(m1);
		allMovies.add(m2);
		allMovies.add(m3);
		allMovies.add(m4);
		allMovies.add(m5);
		
		System.out.println("Printing all movies: ");
		for(Movie movie : allMovies)
			System.out.println(movie);

	}

}








