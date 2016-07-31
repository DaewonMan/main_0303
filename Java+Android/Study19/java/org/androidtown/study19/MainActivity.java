package org.androidtown.study19;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;
    LinearLayout linearLayout;

    static int cnt = 1; // 추가 버튼 갯수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        linearLayout = (LinearLayout)findViewById(R.id.linearLayout);

        button.setOnClickListener(new View.OnClickListener() { // Benz 버튼 동작 함수
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Benz 구입함.", Toast.LENGTH_LONG).show();

                ArrayList<Car> garage = new ArrayList<Car>();
                Car car = new Benz();
                garage.add(car); // arraylist에 추가

                String btName = "Car " + cnt;

                Button bttn = new Button(getApplicationContext()); // 버튼 생성
                bttn.setText(btName); // 이름 설정

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                linearLayout.addView(bttn, params);

                bttn.setOnClickListener(new View.OnClickListener() { // 생성된 버튼 클릭 시
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "지금 선택하신 차종은 Benz 입니다.", Toast.LENGTH_LONG).show();
                    }
                });

                cnt++; // 카운트 증가
            }
        });

        button2.setOnClickListener(new View.OnClickListener() { // BMW 버튼 동작 함수
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "BWM 구입함.", Toast.LENGTH_LONG).show();

                ArrayList<Car> garage = new ArrayList<Car>();
                Car car = new BMW();
                garage.add(car); // arraylist에 추가

                String btName = "Car " + cnt;

                Button bttn = new Button(getApplicationContext()); // 버튼 생성
                bttn.setText(btName); // 이름 설정

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                linearLayout.addView(bttn, params);

                bttn.setOnClickListener(new View.OnClickListener() { // 생성된 버튼 클릭 시
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "지금 선택하신 차종은 BMW 입니다.", Toast.LENGTH_LONG).show();
                    }
                });

                cnt++; // 카운트 증가
            }
        });
    }


}
