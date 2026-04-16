package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testavailableA() {
        assertEquals("Issued", App.bookAvailable(true));
    }

    @Test
    void testavailableB() {
        assertEquals("Not Issues", App.bookAvailable(false));
    }

}
