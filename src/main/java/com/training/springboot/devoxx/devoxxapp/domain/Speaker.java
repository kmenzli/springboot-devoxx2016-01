package com.training.springboot.devoxx.devoxxapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Speaker implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String firstname;
    String lastname;
    String twitter;
    String bio;



    public Speaker() {
    }

    public Speaker(String firstname, String lastname, String twitter, String bio) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.twitter = twitter;
        this.bio = bio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
}
