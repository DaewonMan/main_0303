package org.androidtown.study15;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    EditText editText; // 객체 생성
    EditText editText2;
    Button button;
    Button button2;
    LinearLayout linearLayout;

    Student student = new Student();
    School school = new School();
    Stack<Student> stack = new Stack<Student>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);  // id 찾기
        editText2 = (EditText)findViewById(R.id.editText2);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        linearLayout = (LinearLayout)findViewById(R.id.linearLayout);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), StudentInfoActivity.class);
                //startActivity(intent);
                intent.putExtra(Student.loginName, student.getName());
                intent.putExtra(Student.loginAge, student.getAge());
                startActivityForResult(intent, Student.REQ_CODE_PHONEBOOK);
                
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
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
                stack.push(student); // 학생 객체를 스택에 push
                
                TextView nameTextView = new TextView(getApplicationContext());
                nameTextView.setText(student.getName());
                nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                nameTextView.setTextColor(Color.BLUE);

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                linearLayout.addView(nameTextView, params);
            }
        });
    }
}
