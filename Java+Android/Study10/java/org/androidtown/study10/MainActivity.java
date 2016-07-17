package org.androidtown.study10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        createSinger(kirt); //커트 코베인 인스턴스 생성
        kirt.setName("커트 코베인");
        kirt.setAge(27);

        createSinger(dave); // 데이브 인스턴스 생성
        dave.setName("데이브 그롤");
        dave.setAge(28);

        button2.setOnClickListener(new View.OnClickListener() { // 닫기 버튼 클릭 시, 종료 함수
            @Override
            public void onClick(View v) {
                return;
            }
        });
    }
    public void onPicture1Clicked() { // 커트 코베인 클릭 시 실행 함수
        Toast.makeText(this.getApplicationContext(),"가수의 이름 : " + kirt.getName() + ", 가수의 나이 : " + kirt.getAge(), Toast.LENGTH_LONG).show();
    }
    public void onPicture2Clicked() { // 데이브 그롤 클릭 시 실행 함수
        Toast.makeText(this.getApplicationContext(), "가수의 이름 : " + dave.getName() + ", 가수의 나이 : " + dave.getAge(), Toast.LENGTH_LONG).show();
    }
    public void createSinger(Singer name) {
        name = new Singer(); // 인스턴스 생성
    }

    public void onButton1Clicked() { //설정 버튼 클릭 시 실행 함수
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
