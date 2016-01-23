package com.bellinfo.batch3.corejava.day13;
import java.util.Comparator;

public class NameBasedCriteria implements Comparator<Movie> {

	public int compare(Movie m1, Movie m2) {
		return m1.getName().compareTo(m2.getName());
		
	}
}
