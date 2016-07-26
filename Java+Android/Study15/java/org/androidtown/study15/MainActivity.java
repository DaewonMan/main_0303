package org.androidtown.study15;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText; // 객체 생성
    EditText editText2;
    Button button;

    Student student = new Student();
    School school = new School();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);  // id 찾기
        editText2 = (EditText)findViewById(R.id.editText2);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, temp;
                int age = 0;

                name = editText.getText().toString();
                temp = editText2.getText().toString();
                age = Integer.parseInt(temp); // 문자를 숫자로 변환

                student.setName(name);
                student.setAge(age);

                school.addItem(student.getName()); // arryList에 이름 추가
                school.addStudent(student); // arrayList에 학생 추가

                Intent intent = new Intent(getApplicationContext(), StudentInfoActivity.class);
                //startActivity(intent);
                intent.putExtra(Student.loginName, student.getName());
                intent.putExtra(Student.loginAge, student.getAge());
                startActivityForResult(intent, Student.REQ_CODE_PHONEBOOK);

            }
        });
    }
}
