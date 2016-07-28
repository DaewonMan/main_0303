package org.androidtown.mycalculator;

/**
 * Created by DaewonMan on 2016-07-28.
 */
public class MyCalculator implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int divide(int a, int b) throws UnImplementedException {
        //return 0;
        throw new UnImplementedException("나누기구현안함");
    }

    @Override
    public int subtract(int a, int b) throws UnImplementedException {
        //return 0;
        throw new UnImplementedException("빼기구현안함");
    }

    @Override
    public int multiply(int a, int b) throws UnImplementedException{
        //return 0;
        throw new UnImplementedException("곱하기구현안함");
    }
}
