package org.androidtown.study19;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by DaewonMan on 2016-08-01.
 */
public abstract class CarPrototype implements Car {
    Context context;
    ArrayList<Car> car = new ArrayList<Car>();
    protected int price;

    public CarPrototype(int price) {
        this.price = price;
    }
    public CarPrototype(Context mContext) {
        context = mContext;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Car> getCar() {
        return car;
    }

    public void setCar(ArrayList<Car> car) {
        this.car = car;
    }

    public abstract void doRun();

    @Override
    public void doStart() {
        Toast.makeText(context, "CarPrototype의 doStart 메서드가 호출되었습니다.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void doTurn() {
        Toast.makeText(context, "CarPrototype의 doTurn 메서드가 호출되었습니다.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void doStop() {
        Toast.makeText(context, "CarPrototype의 doStop 메서드가 호출되었습니다.", Toast.LENGTH_LONG).show();
    }
}
