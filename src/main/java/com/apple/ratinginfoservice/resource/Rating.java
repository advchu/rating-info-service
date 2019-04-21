package com.apple.ratinginfoservice.resource;

public class Rating {

	private String movieid;
	private int rating;
	public String getMovieid() {
		return movieid;
	}
	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Rating(String movieid, int rating) {
		this.movieid = movieid;
		this.rating = rating;
	}
	
	
	
	
}
