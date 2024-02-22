package com.consulting.testprojectconsultingrest.services;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TextProcessingService {
    private String text;
    private Map<Character, Integer> resultMap;

    public TextProcessingService() {}

    public String setText(String text) {
        return this.text = text;
    }

    public Map<Character, Integer> allCharsMap() {
        resultMap = new LinkedHashMap<>();

        for(int i = 0; i < text.length(); i++) {
            resultMap.put(text.charAt(i), resultMap.getOrDefault(text.charAt(i), 0) + 1);
        }

        resultMap = resultMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));

        return resultMap;
    }
}
