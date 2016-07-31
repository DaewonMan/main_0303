package org.androidtown.study19;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    LinearLayout linearLayout;
    EditText editText;

    static int cnt = 0; // 추가 버튼 갯수

    ArrayList<Car> garage = new ArrayList<Car>();
    HashMap<String, Integer> index = new HashMap<String, Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        linearLayout = (LinearLayout)findViewById(R.id.linearLayout);
        editText = (EditText)findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() { // Benz 버튼 동작 함수
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Benz 구입함.", Toast.LENGTH_LONG).show();
                String strName;
                int price = 0;

                try {
                    strName = editText.getText().toString();
                    price = Integer.parseInt(strName);
                }
                catch (Exception ex) {
                    Toast.makeText(getApplicationContext(), "금액을 입력하시오!", Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }

                Car car = new Benz(price);

                garage.add(car); // arraylist에 추가

                final String btName = "Car " + (cnt+1);
                index.put(btName, cnt); // 해쉬맵에 버튼이름 할당

                Button bttn = new Button(getApplicationContext()); // 버튼 생성
                bttn.setText(btName); // 이름 설정

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                linearLayout.addView(bttn, params);

                bttn.setOnClickListener(new View.OnClickListener() { // 생성된 버튼 클릭 시
                    @Override
                    public void onClick(View v) {
                        int temp = index.get(btName);
                        Toast.makeText(getApplicationContext(), "지금 선택하신 차종은 Benz이고 가격은 " + garage.get(temp).getPrice() + "만원입니다." , Toast.LENGTH_LONG).show();
                    }
                });

                cnt++; // 카운트 증가
            }
        });

        button2.setOnClickListener(new View.OnClickListener() { // BMW 버튼 동작 함수
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "BMW 구입함.", Toast.LENGTH_LONG).show();
                String strName;
                int price = 0;

                try {
                    strName = editText.getText().toString();
                    price = Integer.parseInt(strName);
                }
                catch (Exception ex) {
                    Toast.makeText(getApplicationContext(), "금액을 입력하시오!", Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }

                Car car = new BMW(price);

                garage.add(car); // arraylist에 추가

                final String btName = "Car " + (cnt+1);
                index.put(btName, cnt); // 해쉬맵에 버튼이름 할당

                Button bttn = new Button(getApplicationContext()); // 버튼 생성
                bttn.setText(btName); // 이름 설정

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                linearLayout.addView(bttn, params);

                bttn.setOnClickListener(new View.OnClickListener() { // 생성된 버튼 클릭 시
                    @Override
                    public void onClick(View v) {
                        int temp = index.get(btName);
                        Toast.makeText(getApplicationContext(), "지금 선택하신 차종은 BMW이고 가격은 " + garage.get(temp).getPrice() + "만원입니다." , Toast.LENGTH_LONG).show();
                    }
                });

                cnt++; // 카운트 증가
            }
        });
    }


}
