package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtServiceTest {

    @Test
    public void minAndMaxValue() {
        SqrtService service = new SqrtService();

        int expected = 3;
        int actual = service.calculate(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void swapValues() {
        SqrtService service = new SqrtService();

        int expected = 0;
        int actual = service.calculate(300, 200);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void goingBeyondBorders() {
        SqrtService service = new SqrtService();

        int expected = 4;
        int actual = service.calculate(180, 320);

        Assertions.assertEquals(expected, actual);
    }
}
