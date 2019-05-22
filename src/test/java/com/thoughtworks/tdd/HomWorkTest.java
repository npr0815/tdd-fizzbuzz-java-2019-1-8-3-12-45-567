package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomWorkTest {
    private HomeWork homeWork;

    @BeforeEach
    void setUp() {
        homeWork = new HomeWork();
    }

    @Test
    void should_return_number_when_input_not_special_number() {
        assertEquals(homeWork.fizzBuzz(1),"1");
    }

    @Test
    void should_return_Fizz_when_input_special_number_multiple_of_3() {
        assertEquals(homeWork.fizzBuzz(3),"Fizz");
    }

    @Test
    void should_return_Bizz_when_input_special_number_multiple_of_5() {
        assertEquals(homeWork.fizzBuzz(5),"Bizz");
    }

    @Test
    void should_return_Whizz_when_input_special_number_multiple_of_7() {
        assertEquals(homeWork.fizzBuzz(7),"Whizz");
    }

    @Test
    void should_return_FizzWhizz_when_input_special_number_multiple_of_21() {
        assertEquals(homeWork.fizzBuzz(21),"FizzWhizz");
    }

    @Test
    void should_return_BizzWhizz_when_input_special_number_multiple_of_35() {
        assertEquals(homeWork.fizzBuzz(35),"BizzWhizz");
    }

    @Test
    void should_return_FizzBizzWhizz_when_input_special_number_multiple_of_105() {
        assertEquals(homeWork.fizzBuzz(105),"FizzBizzWhizz");
    }
}
