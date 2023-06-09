package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialBadInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testNullInput() {
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial(null));
    }

    @Test
    void testNegativeInput(){
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial("-2"));
    }

    @Test
    void testFractionalInput(){
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial("1.5"));
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial("0.7"));
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial("2,3"));
    }

    @Test
    void testNonDigitalInput(){
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial("0009"));
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial("One"));
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial("1o1"));
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial("%()1"));

    }


}
