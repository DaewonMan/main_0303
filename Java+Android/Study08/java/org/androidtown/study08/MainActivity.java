package org.androidtown.study08;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button13 = (Button)findViewById(R.id.button13); // id 참조
        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);

        /* 닫기 함수 */
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return ;
            }
        });
    }
    public void onButton1Clicked(){
        editText.setText("행 인덱스:0");
        editText2.setText("열 인덱스:0");
    }
    public void onButton2Clicked(){
        editText.setText("행 인덱스:0");
        editText2.setText("열 인덱스:1");
    }
    public void onButton3Clicked(){
        editText.setText("행 인덱스:0");
        editText2.setText("열 인덱스:2");
    }
    public void onButton4Clicked(){
        editText.setText("행 인덱스:1");
        editText2.setText("열 인덱스:0");
    }
    public void onButton5Clicked(){
        editText.setText("행 인덱스:1");
        editText2.setText("열 인덱스:1");
    }
    public void onButton6Clicked(){
        editText.setText("행 인덱스:1");
        editText2.setText("열 인덱스:2");
    }
    public void onButton7Clicked(){
        editText.setText("행 인덱스:2");
        editText2.setText("열 인덱스:0");
    }
    public void onButton8Clicked(){
        editText.setText("행 인덱스:2");
        editText2.setText("열 인덱스:1");
    }
    public void onButton9Clicked(){
        editText.setText("행 인덱스:2");
        editText2.setText("열 인덱스:2");
    }
    public void onButton10Clicked(){
        editText.setText("행 인덱스:3");
        editText2.setText("열 인덱스:0");
    }
    public void onButton11Clicked(){
        editText.setText("행 인덱스:3");
        editText2.setText("열 인덱스:1");
    }
    public void onButton12Clicked(){
        editText.setText("행 인덱스:3");
        editText2.setText("열 인덱스:2");
    }
}
