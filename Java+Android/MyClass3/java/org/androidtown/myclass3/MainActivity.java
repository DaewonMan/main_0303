package org.androidtown.myclass3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText; // 객체 생성
    ImageView imageView;
    RadioButton radioButton;
    RadioButton radioButton2;
    Person p; // 여러번 생성하기 위한 객체
    Person p1;
    Baby b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText); // id 찾아서 참조
        imageView = (ImageView)findViewById(R.id.imageView);
        radioButton = (RadioButton)findViewById(R.id.radioButton);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);

    }
    public void onButton1Clicked(View v) { // 사람만들기 버튼 클릭 시 실행 함수
        String name = editText.getText().toString(); // 사용자로부터 이름 입력 받기
        boolean boolCheck = radioButton.isChecked();

        if(boolCheck) {
            createPerson(name);
        }
        else {
            createBaby(name);
        }

        imageView.setVisibility(View.VISIBLE); // 숨긴 이미지를 다시 보이게 하는 메서드
    }
    public void createPerson(String name) { // person 객체 할당 및 초기화
        p1 = new Person(name, this);
        imageView.setImageResource(R.drawable.person); // 어른 사진으로 변환
    }
    public void createBaby(String name) {
        p1 = new Baby(name, this);
        imageView.setImageResource(R.drawable.baby); // 애기 사진으로 변환
    }
    public void onButton2Clicked(View v) { // 걸어가세요 버튼 클릭 시 실행 함수
        if(p1 != null) {
            p1.walk(10);
        }

    }
    public void onButton3Clicked(View v) { // 뛰어가세요 버튼 클릭 시 실행 함수
        if(p1 != null) {
            p1.run(10);
        }

    }
    public void onButton4Clicked(View v) { // 뛰어가세요 버튼 클릭 시 실행 함수
        if (p1 != null) {
            if(p1 instanceof Baby) { // Baby 클래스 인스턴트 인지 확인
                Baby baby1 = (Baby)p1;
                baby1.cry();
            }
            else {
                Toast.makeText(getApplicationContext(), "Baby 객체가 아니어서 cry()메서드 호출 불가!", Toast.LENGTH_LONG).show();
            }

        }
    }
}