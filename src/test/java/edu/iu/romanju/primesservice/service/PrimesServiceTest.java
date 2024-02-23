package edu.iu.romanju.primesservice.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimesServiceTest {
    PrimesService primesService = new PrimesService();

    @Test
    void _45IsNotPrime(){
        int n=45;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected,actual);
    }

    @Test
    void _27IsPrime(){
        int n=29;
        boolean expected = true;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected,actual);
    }

    @Test
    void _100IsNotPrime(){
        int n=100;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected,actual);
    }
}