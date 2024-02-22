package com.consulting.testprojectconsultingrest.services;

import com.consulting.testprojectconsultingrest.TestUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class TextProcessingServiceTest {
    private TextProcessingService service;

    @Autowired
    public TextProcessingServiceTest(TextProcessingService service) {
        this.service = service;
    }

    @Test
    public void testThatMethodAllCharsReturnsCorrectMap() {
        service = new TextProcessingService();
        service.setText("abccc");
        Map<Character, Integer> actual = service.allCharsMap();
        Map<Character, Integer> expected = TestUtils.createMapABCCC();

        assertEquals(actual, expected);
    }
}
