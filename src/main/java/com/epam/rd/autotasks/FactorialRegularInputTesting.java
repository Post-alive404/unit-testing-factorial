package com.epam.rd.autotasks;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void regularInput(){
        assertEquals("1", factorial.factorial("0"));
        assertEquals("1", factorial.factorial("1"));
        assertEquals("6", factorial.factorial("3"));
        assertEquals("5040", factorial.factorial("7"));
        assertEquals("40320", factorial.factorial("8"));
    }
}
