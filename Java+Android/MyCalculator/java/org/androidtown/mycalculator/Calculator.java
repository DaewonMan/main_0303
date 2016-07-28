package org.androidtown.mycalculator;

/**
 * Created by DaewonMan on 2016-07-28.
 */
public interface Calculator {

    public int add(int a, int b);

    public int subtract(int a, int b) throws UnImplementedException;

    public int multiply(int a, int b) throws UnImplementedException;

    public int divide(int a, int b) throws UnImplementedException;

}
