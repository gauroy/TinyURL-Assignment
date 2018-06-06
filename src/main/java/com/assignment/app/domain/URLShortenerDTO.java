package com.assignment.app.domain;

public class URLShortenerDTO {
	
	private String id;
	private String originalURL;
	private String createdOn;
	private String shortenedURL;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOriginalURL() {
		return originalURL;
	}
	public void setOriginalURL(String originalURL) {
		this.originalURL = originalURL;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getShortenedURL() {
		return shortenedURL;
	}
	public void setShortenedURL(String shortenedURL) {
		this.shortenedURL = shortenedURL;
	}

}
