package com.assignment.app.controller;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.assignment.app.domain.*;
import com.assignment.app.services.*;



/*@RestController
@RequestMapping("/api/url")*/
@RestController
@RequestMapping(value = "/")

public class URLResourceController {
	@Autowired
    private URLService urlService;

	
	@RequestMapping(value = "/shorten", method = RequestMethod.POST)
   
    /*@ResponseStatus(HttpStatus.OK)*/
    @ResponseBody
    public URLShortenerDTO saveURL(@RequestParam(value = "originalURL") String originalURL) {
    	
        return urlService.saveUrl(originalURL);
    }
	
	@RequestMapping(value = "/reverse", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public URLShortenerDTO getURL(@RequestParam(value = "shortenedURL") String shortenedURL) {
        return urlService.getURL(shortenedURL);
    }
	

}
