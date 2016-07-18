package org.androidtown.study09;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Singer kirt; // 객체 생성
    Singer dave;
    //ImageView imageView;
    //ImageView imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //imageView = (ImageView)findViewById(R.id.imageView); // id 찾기
        //imageView2 = (ImageView)findViewById(R.id.imageView2);

        createSinger(); //커트 코베인, 데이브 그롤 인스턴스 생성
        kirt.setName("커트 코베인");
        kirt.setAge(27);

        dave.setName("데이브 그롤");
        dave.setAge(28);
    }
    public void createSinger() {
        kirt = new Singer("커트", 20, this); // 인스턴스 생성
        dave = new Singer("데이브", 21, this);
    }
    public void onButton1Clicked(View v) { // 커트 코베인 클릭 시 실행 함수
        kirt.toastMessage();
    }
    public void onButton2Clicked(View v) { // 데이브 그롤 클릭 시 실행 함수
        dave.toastMessage();
    }
}
class Singer {
    String name;
    int age;
    MainActivity activity;

    public Singer(String name, int age, MainActivity inActivity) { // 생성자
        this.name = name;
        this.age = age;
        activity = inActivity;
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

    public void toastMessage() {
        Toast.makeText(activity.getApplicationContext(), "가수의 이름 : " + this.name + ", 가수의 나이 : " + this.age, Toast.LENGTH_LONG).show();
    }
}
