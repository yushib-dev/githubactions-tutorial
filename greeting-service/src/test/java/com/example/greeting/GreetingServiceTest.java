package com.example.greeting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.greeting.GreetingService;


class GreetingServiceTest {

    @Test
    void testGreetWithName() {
        GreetingService service = new GreetingService();
        String result = service.greet("悠真");
        assertEquals("こんにちは、悠真さん！", result);
    }

	@Test
    void testGreetWithEmptyName() {
        GreetingService service = new GreetingService();
        String result = service.greet("");
        assertEquals("こんにちは、ゲストさん！", result);
    }

    @Test
    void testGreetWithNullName() {
        GreetingService service = new GreetingService();
        String result = service.greet(null);
        assertEquals("こんにちは、ゲストさん！", result);
    }
}
