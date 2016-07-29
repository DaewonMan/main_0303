package org.androidtown.mycalculator;

/**
 * Created by DaewonMan on 2016-07-28.
 */
public class MyCalculator extends CalculatorAdapter {

    public int add(int a, int b) {
        int result = a + b;
        addHistory(a, b, CalcData.TYPE_ADD, result);

        return a + b;
    }

}
