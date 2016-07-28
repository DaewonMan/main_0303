package org.androidtown.study17;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText; // 객체 생성
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7; // 졸업 일자 객체
    Button button;
    Button button2;
    Button button3;
    Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText); // id 찾기
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
        editText4 = (EditText)findViewById(R.id.editText4);
        editText5 = (EditText)findViewById(R.id.editText5);
        editText6 = (EditText)findViewById(R.id.editText6);
        editText7 = (EditText)findViewById(R.id.editText7);

        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);

        editText7.setVisibility(View.GONE); // 졸업 일자 가리기

        button.setOnClickListener(new View.OnClickListener() { // 저장 버튼
            @Override
            public void onClick(View v) {
                String name;
                int age;

                name = editText.getText().toString();
                age = Integer.parseInt(editText2.getText().toString());

                Toast.makeText(getApplicationContext(), "학생 프로필 저장됨 : " + name + ", " + age, Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() { // 닫기 버튼
            @Override
            public void onClick(View v) {
                System.exit(1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {  // 대학생 버튼
            @Override
            public void onClick(View v) {
                editText7.setVisibility(View.GONE); // 졸업 일자 가리기
            }
        });

        button4.setOnClickListener(new View.OnClickListener() { // 대학원생 버튼
            @Override
            public void onClick(View v) {
                editText7.setVisibility(View.VISIBLE); // 졸업 일자 보이기
            }
        });
    }
}
