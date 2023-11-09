package com.example.testtaskitconsulting.controller;

import com.example.testtaskitconsulting.service.StringHandlerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController
public class StringHandlerController {

    private final StringHandlerService stringHandlerService;

    public StringHandlerController(StringHandlerService stringHandlerService) {
        this.stringHandlerService = stringHandlerService;
    }

    @PostMapping("/stringStatistics")
    public Map<Character, Long> getStringStatistics(@RequestBody String string) {
        if (string == null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "String cannot be null");
        return stringHandlerService.getStringStatistics(string);
    }
}
