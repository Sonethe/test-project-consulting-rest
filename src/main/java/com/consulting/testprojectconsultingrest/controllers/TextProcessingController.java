package com.consulting.testprojectconsultingrest.controllers;

import com.consulting.testprojectconsultingrest.models.TextProcessingRequest;
import com.consulting.testprojectconsultingrest.models.TextProcessingResponse;
import com.consulting.testprojectconsultingrest.service.TextProcessingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = "application/json")
public class TextProcessingController {
    private final TextProcessingService service;

    @Autowired
    public TextProcessingController(TextProcessingService service) {
        this.service = service;
    }

    @PostMapping(value = "/checkText", consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public TextProcessingResponse setText(@RequestBody TextProcessingRequest request) {

        return service.allCharsMap(request);
    }
}
