package com.consulting.testprojectconsultingrest.controllers;

import com.consulting.testprojectconsultingrest.services.TextProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "/checkText", produces = "application/json")
public class TextProcessingController {
    private final TextProcessingService textProcessingService;

    @Autowired
    public TextProcessingController(TextProcessingService textProcessingService) {
        this.textProcessingService = textProcessingService;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public Map<Character, Integer> getCharMap() {
        return textProcessingService.allCharsMap();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public String setText(@RequestBody String text) {
        return textProcessingService.setText(text);
    }
}
