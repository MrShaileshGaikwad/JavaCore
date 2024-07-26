package com.guvi;

public class Library {
	private String title;
	private String author;
	private boolean isLentOut;
	public Library(String title, String author, boolean isLentOut) {
		super();
		this.title = title;
		this.author = author;
		this.isLentOut = isLentOut;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isLentOut() {
		return isLentOut;
	}
	public void setLentOut(boolean isLentOut) {
		this.isLentOut = isLentOut;
	}
}

