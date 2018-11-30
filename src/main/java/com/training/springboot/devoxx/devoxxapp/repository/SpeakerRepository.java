package com.training.springboot.devoxx.devoxxapp.repository;

import com.training.springboot.devoxx.devoxxapp.domain.Speaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface SpeakerRepository extends CrudRepository<Speaker, Long> {
    @RestResource (path = "by-twitter")
    Speaker findByTwitter(@Param("twitter") String twitter);
    @RestResource (path = "by-lastname")
    Collection<Speaker> findByLastname(@Param("lastname") String lastname);
}
