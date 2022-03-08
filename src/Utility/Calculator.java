package Utility;

import Exceptions.ValueException;

public class Calculator {
    public static int sum(int val1, int val2) throws ValueException {
        return val1 + val2;
    }
    public static int razn(int val1, int val2){
        return val1 - val2;
    }
    public static int proizv(int val1, int val2){
        return val1 * val2;
    }
    public static int del(int val1, int val2){
        return val1 / val2;
    }

}

