package org.androidtown.myclass3;

import android.widget.Toast;

/**
 * Created by DaewonMan on 2016-07-20.
 */
public class Person {
    String name;
    Leg leg = new Leg();
    MainActivity activity;

    public Person(String inName, MainActivity inActivity) {
        name = inName;
        activity = inActivity;
    }

    public Person() {

    }

    public Leg getLeg() {
        return  leg;
    }
    public void walk(int speed) {
        //System.out.println(name + " " + speed + "km 속도로 걸어갑니다.");
        Toast.makeText(activity.getApplicationContext(), name + "이(가) " + speed + "km 속도로 걸어갑니다.", Toast.LENGTH_LONG).show();
        activity.imageView.setImageResource(R.drawable.person_walk);
    }
    public void run(int speed) {
        //System.out.println(name + " " + speed + "km 속도로 뛰어갑니다.");
        Toast.makeText(activity.getApplicationContext(), name + "이(가) " + speed + "km 속도로 뛰어갑니다.", Toast.LENGTH_LONG).show();
        activity.imageView.setImageResource(R.drawable.person_run);
    }
}