package com.bellinfo.batch3.corejava.day13;

import java.util.Comparator;

public class RatingBasedCriteria implements Comparator<Movie>{

	@Override public int compare(Movie m1, Movie m2) {
		return m1.getRating()-m2.getRating();
	}

}
