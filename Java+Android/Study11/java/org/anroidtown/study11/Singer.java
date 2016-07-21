package org.anroidtown.study11;

import android.widget.Toast;

/**
 * Created by DaewonMan on 2016-07-21.
 */
public class Singer {
    String name;
    int age;
    MainActivity activity;

    public Singer() { // 생성자

    }
    public Singer(String name, int age, MainActivity inActivity) {
        this.name = name;
        this.age = age;
        activity = inActivity;
    }
    public void singerShow() {
        Toast.makeText(activity.getApplicationContext(), "가수 추가됨 : " + name + ", 가수의 나이 : " + age, Toast.LENGTH_LONG).show();
    }
    public void girlGroupShow() {
        Toast.makeText(activity.getApplicationContext(), "걸그룹 추가됨 : " + name + ", 걸그룹의 나이 : " + age, Toast.LENGTH_LONG).show();
    }

}
