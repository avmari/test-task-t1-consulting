package com.example.testtaskitconsulting.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StringHandlerServiceTest {

    @Autowired
    private StringHandlerService stringHandlerService;


    @Test
    void getStringStatistics() {
        Map<Character, Long> expectedResult = new LinkedHashMap<>();
        expectedResult.put('a', 4L);
        expectedResult.put('b', 3L);
        expectedResult.put('c', 3L);

        assertEquals(expectedResult, stringHandlerService.getStringStatistics("aaababbccc"));
    }
}