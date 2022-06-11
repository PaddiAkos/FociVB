package hu.progmatic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class testTest {

    @Test
    void test_isPrime(){
        assertFalse(test.isPrime(4));
        assertFalse(test.isPrime(1));
        assertFalse(test.isPrime(7));
        assertFalse(test.isPrime(2545));
        assertTrue(test.isPrime(2));
        assertTrue(test.isPrime(5));
        assertTrue(test.isPrime(17));
        assertTrue(test.isPrime(43244347));
    }
}