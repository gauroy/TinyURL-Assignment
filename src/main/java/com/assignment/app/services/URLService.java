package com.assignment.app.services;
import com.assignment.app.domain.*;

public interface URLService {
	URLShortenerDTO saveUrl(String originalURL);
	URLShortenerDTO getURL(String shortenedURL);
}
