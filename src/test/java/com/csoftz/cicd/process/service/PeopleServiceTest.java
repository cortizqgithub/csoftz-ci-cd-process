package com.csoftz.cicd.process.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PeopleServiceTest {

    private PeopleService peopleService;

    @BeforeEach
    void setUp() {
        peopleService = new PeopleService();
    }

    @Test
    void givenOperandsReturnsSum() {
        Integer rslt = peopleService.add(3, 2);
        assertThat(rslt).isEqualTo(5);
    }
}