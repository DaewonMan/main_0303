package org.androidtown.mydata3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ScrollView scrollView;

    int count = 0;
    Person person01;
    Person[] persons = new Person[5];
    String[] names = {"철수", "영희", "민희", "수지", "지민"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        scrollView = (ScrollView)findViewById(R.id.scrollView);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count >= names.length) {
                    Person[] tempPersons = new Person[persons.length + 5];
                    System.arraycopy(persons, 0, tempPersons, 0, persons.length);
                    persons = tempPersons;
                }

                int nameIndex = count % 5;
                persons[count] = new Person(names[nameIndex]);
                Toast.makeText(getApplicationContext(), "사람 " + names[nameIndex] + "이 만들어졌습니다.", Toast.LENGTH_LONG).show();
                count ++;

                textView.setText(count + " 명");

                for(int i = 0;i < count;i++) {
                    System.out.println(i + ":" + persons[i].getName());
                }
            }
        });
    }
}
