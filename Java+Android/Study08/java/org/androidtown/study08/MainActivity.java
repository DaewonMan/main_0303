package org.androidtown.study08;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*
    Button button; // 객체 생성
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    */
    Button button13;
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button13 = (Button)findViewById(R.id.button13); // id 참조
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);

        /* 닫기 함수 */
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
    public void onButton1Clicked(View v){
        textView.setText("행 인덱스:0");
        textView2.setText("열 인덱스:0");
    }
    public void onButton2Clicked(View v){
        textView.setText("행 인덱스:0");
        textView2.setText("열 인덱스:1");
    }
    public void onButton3Clicked(View v){
        textView.setText("행 인덱스:0");
        textView2.setText("열 인덱스:2");
    }
    public void onButton4Clicked(View v){
        textView.setText("행 인덱스:1");
        textView2.setText("열 인덱스:0");
    }
    public void onButton5Clicked(View v){
        textView.setText("행 인덱스:1");
        textView2.setText("열 인덱스:1");
    }
    public void onButton6Clicked(View v){
        textView.setText("행 인덱스:1");
        textView2.setText("열 인덱스:2");
    }
    public void onButton7Clicked(View v){
        textView.setText("행 인덱스:2");
        textView2.setText("열 인덱스:0");
    }
    public void onButton8Clicked(View v){
        textView.setText("행 인덱스:2");
        textView2.setText("열 인덱스:1");
    }
    public void onButton9Clicked(View v){
        textView.setText("행 인덱스:2");
        textView2.setText("열 인덱스:2");
    }
    public void onButton10Clicked(View v){
        textView.setText("행 인덱스:3");
        textView2.setText("열 인덱스:0");
    }
    public void onButton11Clicked(View v){
        textView.setText("행 인덱스:3");
        textView2.setText("열 인덱스:1");
    }
    public void onButton12Clicked(View v){
        textView.setText("행 인덱스:3");
        textView2.setText("열 인덱스:2");
    }
}
