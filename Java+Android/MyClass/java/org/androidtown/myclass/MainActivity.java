package org.androidtown.myclass;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person jack = new Person("잭", this);
        jack.walk(10);

        Person mike = new Person("마이크", this);
        mike.walk(10);

        Person sean = new Person("션", this);
        sean.walk(10);

        Person person1 = new Person("철수", this);
        Person person2 = person1; // person1객체 참조
        Leg outLeg = new Leg();

        outLeg = person2.getLeg(); // person객체의 leg 객체 참조
        System.out.println(outLeg.left);
        person2.leg.left = "왼쪽다리";
        System.out.println(outLeg.left);

    }
}
class Leg {
    String right = "오른쪽";
    String left = "왼쪽";

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }
}
class Person {
    String name;
    Leg leg = new Leg();
    Activity activity;

    public Person(String inName, MainActivity inActivity) {
        name = inName;
        activity = inActivity;
    }
    public Leg getLeg() {
        return  leg;
    }
    public void walk(int speed) {
        //System.out.println(name + " " + speed + "km 속도로 걸어갑니다.");
        Toast.makeText(activity.getApplicationContext(), name + "이(가) " + speed + "km 속도로 걸어갑니다.", Toast.LENGTH_LONG).show();
    }
    public void run(int speed) {
        System.out.println(name + " " + speed + "km 속도로 뛰어갑니다.");
    }
}