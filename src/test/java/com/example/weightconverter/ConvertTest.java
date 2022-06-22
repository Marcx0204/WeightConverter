package com.example.weightconverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertTest {
    private Converter convert = new Converter();

    @Test
    void ouncetogramTest(){
        // Arange
        double ounce = 5;
        double expected = 141.75;

        //Act
        double result = convert.ouncetogram(ounce);

        //Assert
        assertEquals(expected, result);

    }
    @Test
    void stonetokiloTest(){
        // Arange
        double stone = 5;
        double expected = 31.75;

        //Act
        double result = convert.stonetokilo(stone);

        //Assert
        assertEquals(expected, result);

    }



}
