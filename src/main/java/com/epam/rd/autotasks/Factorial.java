package com.epam.rd.autotasks;

public class Factorial {
    public String factorial(String n) {
        if(n == null || !n.matches("^[1-9][0-9]*|0$")) throw new IllegalArgumentException();

        int number = Integer.parseInt(n);

        int result = 1;
        while (number > 0){
            result = result * number;
            number--;
        }
        return String.valueOf(result);
    }
}
