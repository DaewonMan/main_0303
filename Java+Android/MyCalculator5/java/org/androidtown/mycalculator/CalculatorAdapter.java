package org.androidtown.mycalculator;

import java.util.ArrayList;

/**
 * Created by DaewonMan on 2016-07-29.
 */
public abstract class CalculatorAdapter implements Calculator {

    private ArrayList<CalcData> history = new ArrayList<CalcData>();

    public void addHistory(int a, int b, int type, int result) {
        CalcData data = new CalcData(a, b, type, result);
        history.add(data);
    }

    public void clearHistory() {
        history.clear();
    }

    public ArrayList<CalcData> getHistory() {
        return history;
    }

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
