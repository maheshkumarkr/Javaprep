package com.progs;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	@Test
    public void primeNumberTest() {
        Prime tester = new Prime(); // MyClass is tested

        // assert statements
        assertEquals("45 is not prime", "NO", tester.isPrime(45));
        assertEquals("101 is prime", "YES", tester.isPrime(101));
        assertEquals("779 is not prime", "NO", tester.isPrime(779));
        assertEquals("5 is prime", "YES", tester.isPrime(5));
        assertEquals("1 is not a valid number", "Please enter a valid number", tester.isPrime(1));
    }

}
