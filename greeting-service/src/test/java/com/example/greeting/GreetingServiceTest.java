package com.example.greeting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class GreetingServiceTest {

    @Test
    void testGreetWithName() {
        GreetingService service = new GreetingService();
        String result = service.greet("Taro");
        assertEquals("Hello, Taro!", result);
    }

	@Test
    void testGreetWithEmptyName() {
        GreetingService service = new GreetingService();
        String result = service.greet("");
        assertEquals("Hello, Guest!", result);
    }

    @Test
    void testGreetWithNullName() {
        GreetingService service = new GreetingService();
        String result = service.greet(null);
        assertEquals("Hello, Guest!", result);
    }
}
