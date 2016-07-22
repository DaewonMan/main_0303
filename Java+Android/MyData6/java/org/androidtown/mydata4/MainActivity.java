package org.androidtown.mydata4;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ScrollView scrollView;
    LinearLayout linearLayout;
    Button button2;
    EditText editText;

    int count = 0;
    Person person01;
    String[] names = {"철수", "영희", "민희", "수지", "지민"};
    String[] groups = {"친구", "가족"};

    ArrayList<Person> persons = new ArrayList<Person>();
    //ArrayList<ArrayList<String>> phoneBook = new ArrayList<ArrayList<String>>();
    HashMap<String, ArrayList<String>> phonebook = new HashMap<String, ArrayList<String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Data6 */

        Spinner spinner = (Spinner)findViewById(R.id.spinner); // id 찾기
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, groups);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "선택된 아이템 인덱스 : " + position, Toast.LENGTH_LONG).show();

                String curGroup = groups[position];
                ArrayList<String> nameList = phonebook.get(curGroup);

                linearLayout.removeAllViews(); // 기존에 리니어 레이아웃에 들어있는 모든 위젯 삭제
                for(int i = 0;i < nameList.size();i++) {
                    String curName = nameList.get(i);

                    addPersonTextView(curName); // linearLayout에 출력할 수 있도록 하는 함수
                    textView.setText(persons.size() + " 명");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ArrayList<String> friends = new ArrayList<String>();
        friends.add("철수");
        friends.add("영희");
        friends.add("민희");
        friends.add("수지");
        friends.add("지민");

        //phoneBook.add(friends);
        phonebook.put("친구", friends);

        ArrayList<String> family = new ArrayList<String>();
        family.add("할머니");
        family.add("할아버지");
        family.add("엄마");
        family.add("아빠");
        family.add("동생");

        //phoneBook.add(family);
        phonebook.put("가족", family);

        String outNames = "";
        Set<String> keys = phonebook.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            String curGroup = iter.next();
            outNames += ("\n" + curGroup + "그룹 : ");
            ArrayList<String> nameList = phonebook.get(curGroup);
            for(int j = 0;j < nameList.size();j++) {
                outNames += nameList.get(j);
                if(j < (nameList.size()-1)) {
                    outNames += ",";
                }
            }
        }
        System.out.println(outNames);

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

    public void addPersonTextView(String curName) {
        TextView nameTextView = new TextView(getApplicationContext());
        nameTextView.setText(curName);
        nameTextView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
        nameTextView.setTextColor(Color.BLUE);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        linearLayout.addView(nameTextView, params);

    }
}
