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

        //Hello
    }

}
