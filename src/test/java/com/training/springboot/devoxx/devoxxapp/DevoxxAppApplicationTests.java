package com.training.springboot.devoxx.devoxxapp;

import com.training.springboot.devoxx.devoxxapp.rest.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DevoxxAppApplicationTests {

    @Value("${local.server.port}")
    private int port;

    @Autowired
    HomeController homeController;

    /**
     * @Test public void contextLoads() {
     * }
     */

    @Test
    public void test1() {

        assertThat(homeController).isNotNull();
    }


    @Test
    public void test2() {
        String url = "http://localhost:" + port + "/";
        String body = new TestRestTemplate("youssef", "123").getForObject(url, String.class);
        assertThat(body).isEqualTo("hello my configurationdevoxx");
    }

}
