package org.androidtown.study10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Singer kirt; // 객체 생성
    Singer dave;
    RadioButton radioButton;
    RadioButton radioButton2;
    EditText editText;
    EditText editText2;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton = (RadioButton)findViewById(R.id.radioButton);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        button2 = (Button)findViewById(R.id.button2);

        createSinger(); //커트 코베인, 데이브 그롤 인스턴스 생성
        //kirt.setName("커트 코베인");
        //kirt.setAge(27);
        //dave.setName("데이브 그롤");
        //dave.setAge(28);

        button2.setOnClickListener(new View.OnClickListener() { // 닫기 버튼 클릭 시, 종료 함수
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
    public void createSinger() {
        kirt = new Singer("커트코베인", 27, this); // 인스턴스 생성
        dave = new Singer("데이브그롤", 28, this);
    }
    public void onPicture1Clicked(View v) { // 커트 코베인 클릭 시 실행 함수
        kirt.toastMessage();
    }
    public void onPicture2Clicked(View v) { // 데이브 그롤 클릭 시 실행 함수
        dave.toastMessage();
    }


    public void onButton1Clicked(View v) { //설정 버튼 클릭 시 실행 함수
        String name, temp;
        int age = 0;

        name = editText.getText().toString(); // 가수 이름 할당
        temp = editText2.getText().toString(); // 가수 나이 할당
        age = Integer.parseInt(temp); // 문자열을 숫자로 변환

        if(radioButton.isChecked() == true) { // 커트 사진 밑에 버튼 클릭 시
            kirt.setName(name);
            kirt.setAge(age);
        }
        else if(radioButton2.isChecked() == true){  // 데이브 사진 밑에 버튼 클릭 시
            dave.setName(name);
            dave.setAge(age);
        }
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
