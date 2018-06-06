package com.assignment.app.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.assignment.app.utils.*;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;


@Document
public class URLShortener implements DomainConstants{
	@Id
	private String id;
	
	@Type(type = COMMON_DATE_TYPE)
	private DateTime createdOn = new DateTime();
	
	
	private String originalURL;
	
	private long sequence;

	
	public long getSequence() {
		return sequence;
	}

	public void setSequence(long sequence) {
		this.sequence = sequence;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(DateTime createdOn) {
		this.createdOn = createdOn;
	}

	public String getOriginalURL() {
		return originalURL;
	}

	public void setOriginalURL(String originalURL) {
		this.originalURL = originalURL;
	}
}
