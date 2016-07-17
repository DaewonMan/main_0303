package org.androidtown.study09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Singer kirt; // 객체 생성
    Singer dave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton1Clicked() { // 커트 코베인 클릭 시 실행 함수
        createSinger(kirt); //커트 코베인 인스턴스 생성
        kirt.setName("커트 코베인");
        kirt.setAge(27);
        Toast.makeText(this.getApplicationContext(),"가수의 이름 : " + kirt.getName() + ", 가수의 나이 : " + kirt.getAge(), Toast.LENGTH_LONG).show();
    }
    public void onButton2Clicked() { // 데이브 그롤 클릭 시 실행 함수
        createSinger(dave); // 데이브 인스턴스 생성
        dave.setName("데이브 그롤");
        dave.setAge(28);
        Toast.makeText(this.getApplicationContext(), "가수의 이름 : " + dave.getName() + ", 가수의 나이 : " + dave.getAge(), Toast.LENGTH_LONG).show();
    }
    public void createSinger(Singer name) {
        name = new Singer(); // 인스턴스 생성
    }
}
class Singer {
    String name;
    int age;

    public Singer() { // 생성자

    }
    public String getName() {  // name변수 겟터
        return name;
    }

    public void setName(String name) { // name변수 셋터
        this.name = name;
    }

    public int getAge() { // age변수 겟터
        return age;
    }

    public void setAge(int age) { // age변수 셋터
        this.age = age;
    }
}
