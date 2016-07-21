package org.androidtown.mydata4;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ScrollView scrollView;
    LinearLayout linearLayout;

    int count = 0;
    Person person01;
    Person[] persons = new Person[5];
    String[] names = {"철수", "영희", "민희", "수지", "지민"};
    String[][] phoneBook = new String[2][5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] friends = {"철수", "영희", "민희", "수지", "지민"};
        String[] family = {"할머니", "할아버지", "엄마", "아빠", "동생"};
        phoneBook[0] = friends;
        phoneBook[1] = family;

        String outNames = "";
        for(int i = 0;i < phoneBook.length;i++) {
            outNames += ("\n" + i + " 인덱스의 그룹 : ");
            for(int j = 0;j < phoneBook[i].length;j++) {
                outNames += phoneBook[i][j];
                if(j < (phoneBook[i].length-1)) {
                    outNames += ",";
                }
            }
            System.out.println(outNames);
        }

        textView = (TextView)findViewById(R.id.textView);
        scrollView = (ScrollView)findViewById(R.id.scrollView);
        linearLayout = (LinearLayout)findViewById(R.id.linearLayout);

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

                String curName = persons[count].getName();
                TextView nameTextView = new TextView(getApplicationContext());
                nameTextView.setText(curName);
                nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                nameTextView.setTextColor(Color.BLUE);

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                linearLayout.addView(nameTextView, params);


                count++;
                textView.setText(count + " 명");
            }
        });
    }
}
