package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAddNumbers() {
        int result = App.addNumbers(5, 10);
        assertEquals(15, result);
    }
}
