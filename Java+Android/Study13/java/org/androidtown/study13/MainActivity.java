package org.androidtown.study13;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    TextView textView;

    Student student = new Student(); // 인스턴스 생성
    School school = new School();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText); // id 찾기
        editText2 = (EditText)findViewById(R.id.editText2);
        textView = (TextView)findViewById(R.id.textView);
    }

    public void onButton1Clicked(View v) { // 추가 버튼
        String name, temp;
        int age;

        name = editText.getText().toString(); // 사용자가 입력한 이름 할당
        temp = editText2.getText().toString(); // 사용자가 입력한 나이 할당
        age = Integer.parseInt(temp); // 문자를 숫자로 변환

        student.setName(name);
        student.setAge(age);

        school.addItem(student.getName()); // 객체 추가

        Toast.makeText(getApplicationContext(), "학생 객체가 리스트에 추가됨 : " + name + ", 학생의 나이 : " + age, Toast.LENGTH_LONG).show();

        textView.setText("추가된 학생의 총 수 : " + school.returnSize() + " 명");

   }
}
