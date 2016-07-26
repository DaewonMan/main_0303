package org.androidtown.study15;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentInfoActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    Button button;

    /*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == Student.REQ_CODE_PHONEBOOK) {
            if(resultCode == Student.RES_CODE_SUCCESS) {
                String name = data.getStringExtra(Student.loginName);
                int age = Integer.parseInt(data.getStringExtra(Student.loginAge));

                editText.setText(name);
                editText2.setText(age);

                Toast.makeText(getApplicationContext(), "학생 객체가 리스트에 추가됨 : " + name + ", 나이 : " + age, Toast.LENGTH_LONG ).show();
            }
            else {
                Toast.makeText(getApplicationContext(), "실패하였습니다.", Toast.LENGTH_LONG).show();
            }
        }

        String name = data.getStringExtra(Student.loginName);
        int age = Integer.parseInt(data.getStringExtra(Student.loginAge));

        editText.setText(name);
        editText2.setText(age);

        Toast.makeText(getApplicationContext(), "학생 객체가 리스트에 추가됨 : " + name + ", 나이 : " + age, Toast.LENGTH_LONG ).show();
    }
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        button = (Button)findViewById(R.id.button);

        Intent intent = getIntent();
        if(intent != null ) {
            String name = intent.getStringExtra(Student.loginName);
            String temp = String.valueOf(intent.getStringExtra(Student.loginAge));
            //int age = intent.getStringExtra(Student.loginAge);

            editText.setText(name);
            editText2.setText(temp);

            Toast.makeText(getApplicationContext(), "학생 객체가 리스트에 추가됨 : " + name + ", 나이 : " + temp, Toast.LENGTH_LONG ).show();
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}
