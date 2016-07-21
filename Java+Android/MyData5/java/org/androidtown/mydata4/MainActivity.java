package org.androidtown.mydata4;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ScrollView scrollView;
    LinearLayout linearLayout;
    Button button2;
    EditText editText;

    int count = 0;
    Person person01;
    //Person[] persons = new Person[5];
    String[] names = {"철수", "영희", "민희", "수지", "지민"};
    //String[][] phoneBook = new String[2][5];
    ArrayList<Person> persons = new ArrayList<Person>();
    ArrayList<ArrayList<String>> phoneBook = new ArrayList<ArrayList<String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //String[] friends = {"철수", "영희", "민희", "수지", "지민"};
        //String[] family = {"할머니", "할아버지", "엄마", "아빠", "동생"};
        //phoneBook[0] = friends;
        //phoneBook[1] = family;
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("철수");
        friends.add("영희");
        friends.add("민희");
        friends.add("수지");
        friends.add("지민");

        phoneBook.add(friends);

        ArrayList<String> family = new ArrayList<String>();
        family.add("할머니");
        family.add("할아버지");
        family.add("엄마");
        family.add("아빠");
        family.add("동생");

        phoneBook.add(family);

        String outNames = "";
        for(int i = 0;i < phoneBook.size();i++) {
            outNames += ("\n" + i + "인덱스의 그룹 : ");
            ArrayList<String> nameList = phoneBook.get(i);
            for(int j = 0;j < nameList.size();j++) {
                outNames += nameList.get(j);
                if(j < (nameList.size()-1)) {
                    outNames += ",";
                }
            }
        }
        System.out.println(outNames);

        for(int i = 0;i < persons.size();i++) {
            System.out.println(i + ":" + persons.get(i).getName());
        }

        Iterator<Person> iter = persons.iterator();
        int outIndex = 0;
        while(iter.hasNext()) {
            Person outPerson = iter.next();
            System.out.println(outIndex + ":" + outPerson.getName());
            outIndex++;
        }

        textView = (TextView)findViewById(R.id.textView);
        scrollView = (ScrollView)findViewById(R.id.scrollView);
        linearLayout = (LinearLayout)findViewById(R.id.linearLayout);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int nameIndex = count % 5;
                Person curPerson = new Person(names[nameIndex]);
                persons.add(curPerson);
                Toast.makeText(getApplicationContext(), "사람 " + names[nameIndex] + "이 만들어졌습니다.", Toast.LENGTH_LONG).show();

                String curName = curPerson.getName();
                TextView nameTextView = new TextView(getApplicationContext());
                nameTextView.setText(curName);
                nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                nameTextView.setTextColor(Color.BLUE);

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                linearLayout.addView(nameTextView, params);


                count++;
                textView.setText(persons.size() + " 명");
            }
        });
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = (EditText)findViewById(R.id.editText);
                String curName = editText.getText().toString();

                Person curPerson = new Person(curName);
                persons.add(curPerson);
                Toast.makeText(getApplicationContext(), "사람 " + curName + "이 만들어졌습니다.", Toast.LENGTH_LONG).show();
                TextView nameTextView = new TextView(getApplicationContext());
                nameTextView.setText(curName);
                nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                nameTextView.setTextColor(Color.BLUE);
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                linearLayout.addView(nameTextView, params);
                textView.setText(persons.size() + " 명");
            }
        });
    }
}
