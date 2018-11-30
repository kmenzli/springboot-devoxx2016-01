package com.training.springboot.devoxx.devoxxapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@RestController

public class HomeController {

    @Value("${training.conference.name:devoxx}")
    String conference;


    @Secured("ROLE_HERO")
    @RequestMapping ("/")
    protected String home(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(">>>>>>>>>>>>>>"+request.getRemoteUser());
        for (Enumeration<String> enumeration = request.getSession().getAttributeNames(); enumeration.hasMoreElements();) {
            String attributeName = enumeration.nextElement();
            Object attribute = request.getSession().getAttribute(attributeName);
            System.out.println(attributeName + " -> " + attribute.getClass().getName() + " : " + attribute.toString());
        }
        return "hello my configuration"+conference;
    }
}
