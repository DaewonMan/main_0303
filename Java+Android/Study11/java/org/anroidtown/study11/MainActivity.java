package org.anroidtown.study11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText; // 객체 생성
    EditText editText2;

    Singer s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText); // id 찾기
        editText2 = (EditText)findViewById(R.id.editText2);
    }
    public void onButton1Clicked(View v) { // 가수 추가 함수
        String name, temp;
        int age = 0;

        name = editText.getText().toString();
        temp = editText2.getText().toString();

        if (name != "" && temp != "") {
            age = Integer.parseInt(temp);
            s = new Singer(name, age, this); // 가수 인스턴스 생성
            s.singerShow();
        }
    }
    public void onButton2Clicked(View v) { // 걸그룹 추가 함수
        String name, temp;
        int age = 0;

        name = editText.getText().toString();
        temp = editText2.getText().toString();

        if (name != "" && temp != "") {
            age = Integer.parseInt(temp);
            s = new Singer(name, age, this); // 가수 인스턴스 생성
            s.girlGroupShow();
        }
    }
}
