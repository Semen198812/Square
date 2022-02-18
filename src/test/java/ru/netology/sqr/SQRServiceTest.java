package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void countSquares() {
        SQRService service = new SQRService();
        int minimum = 200;
        int maximum = 300;
        int expected = 3;
        int actual = service.countSquares(minimum, maximum);
        assertEquals(expected, actual);
    }


}