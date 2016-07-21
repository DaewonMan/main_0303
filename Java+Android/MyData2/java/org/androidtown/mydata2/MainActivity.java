package org.androidtown.mydata2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    Person person01;

    String[] names = {"철수", "영희", "민희", "수지", "지민"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count < names.length) {
                    person01 = new Person(names[count]);
                    Toast.makeText(getApplicationContext(), names[count] + " 이 만들어졌습니다.", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "사람 정보가 없습니다.", Toast.LENGTH_LONG).show();
                }

                count++;
            }
        });
    }
}
