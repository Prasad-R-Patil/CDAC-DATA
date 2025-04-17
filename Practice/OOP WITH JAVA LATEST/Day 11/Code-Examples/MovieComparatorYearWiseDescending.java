package collections;

import java.util.Comparator;

public class MovieComparatorYearWiseDescending implements Comparator<Movie>{

	@Override
	public int compare(Movie movie1, Movie movie2) {
		// This class provides a customized sorting algorithm
		//E.g. In this case it is year wise Ascending
		Integer year1 = movie1.getYear();
		Integer year2 = movie2.getYear();
		int comparison = year2.compareTo(year1);
		return comparison;
	}

}



