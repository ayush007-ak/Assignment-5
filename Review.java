package com.java.entity;

public class Review {
	
	
	public Review() {}
public String getReviewby() {
		return reviewby;
	}
	public void setReviewby(String reviewby) {
		this.reviewby = reviewby;
	}
	public String getReviewcomment() {
		return reviewcomment;
	}
	public void setReviewcomment(String reviewcomment) {
		this.reviewcomment = reviewcomment;
	}
	public int getRating() {
		return rating;
	}
	@Override
	public String toString() {
		return "Review [reviewby=" + reviewby + ", reviewcomment=" + reviewcomment + ", rating=" + rating + "]";
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
private String reviewby;
private String reviewcomment;
private int rating;


}
