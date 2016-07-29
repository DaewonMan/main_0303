package org.androidtown.mycalculator;

/**
 * Created by DaewonMan on 2016-07-29.
 */
public abstract class CalculatorObject implements Calculator {
    public abstract int add(int a, int b);

    public int subtract(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("빼기구현안함");
    }

    public int multiply(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("곱하기구현안함");
    }

    public int divide(int a, int b) throws UnImplementedException {
        throw new UnImplementedException("나누기구현안함");
    }
}
