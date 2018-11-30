package com.training.springboot.devoxx.devoxxapp;

import com.training.springboot.devoxx.devoxxapp.domain.Speaker;
import com.training.springboot.devoxx.devoxxapp.repository.SpeakerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpeakerRepositoryTest {


    @Autowired
    SpeakerRepository speakerRepository;


    @Test
    public void test3() {
        Speaker khemais = speakerRepository.save(new Speaker("khemais", "Menzli", "khemais_menzli", "My bio"));

        assertThat(speakerRepository.findByTwitter("khemais_menzli").getId()).isEqualTo(khemais.getId());
    }
}
