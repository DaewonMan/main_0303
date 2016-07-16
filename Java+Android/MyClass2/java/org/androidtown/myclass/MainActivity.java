package org.androidtown.myclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText; // 객체 생성
    ImageView imageView;
    Person p; // 여러번 생성하기 위한 객체

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText); // id 찾아서 참조
        imageView = (ImageView)findViewById(R.id.imageView);

        Person jack = new Person("잭", this);
        jack.walk(10);

        Person mike = new Person("마이크", this);
        mike.walk(10);

        Person sean = new Person("션", this);
        sean.walk(10);

        Person person1 = new Person("영화", this);
        Person person2 = person1; // person1객체 참조
        Leg outLeg = new Leg();

        outLeg = person2.getLeg(); // person객체의 leg 객체 참조
        System.out.println(outLeg.left);
        person2.leg.left = "왼쪽다리";
        System.out.println(outLeg.left);

    }
    public void onButton1Clicked(View v) { // 사람만들기 버튼 클릭 시 실행 함수
        String name = editText.getText().toString(); // 사용자로부터 이름 입력 받기
        createPerson(name);
    }
    public void createPerson(String name) { // person 객체 할당 및 초기화
        p = new Person(name, this);
    }
    public void onButton2Clicked(View v) { // 걸어가세요 버튼 클릭 시 실행 함수
        p.walk(10);
    }
    public void onButton3Clicked(View v) { // 뛰어가세요 버튼 클릭 시 실행 함수
        p.run(10);
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
    MainActivity activity;

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
        activity.imageView.setImageResource(R.drawable.person_walk);
    }
    public void run(int speed) {
        //System.out.println(name + " " + speed + "km 속도로 뛰어갑니다.");
        Toast.makeText(activity.getApplicationContext(), name + "이(가) " + speed + "km 속도로 뛰어갑니다.", Toast.LENGTH_LONG).show();
        activity.imageView.setImageResource(R.drawable.person_run);
    }
}
