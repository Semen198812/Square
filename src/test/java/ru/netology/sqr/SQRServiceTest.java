package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void countSquares() {
        SQRService service = new SQRService();
        int minimum = 200;
        int maximum = 400;
        int expected = 6;
        int actual = service.countSquares(minimum, maximum);
        assertEquals(expected, actual);
    }


}