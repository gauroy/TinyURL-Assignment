package com.assignment.app.dao;
import org.springframework.data.mongodb.repository.MongoRepository;

/*import org.springframework.data.jpa.repository.JpaRepository;*/
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import com.assignment.app.domain.*;

public interface URLRepository  extends MongoRepository <URLShortener, String>{
	

	Optional<URLShortener> findById(@Param(value = "id") String id);
	
	
	Optional<URLShortener> findByOriginalURL(
	            @Param(value = "originalURL") String originalURL);
	
	
	Optional<URLShortener> findBySequence(
            @Param(value = "sequence") long sequence);   
	
}