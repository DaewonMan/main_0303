package org.androidtown.study07;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    FrameLayout layout1; //객체 생성
    TextView textView;
    Button button;
    static int cnt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1 = (FrameLayout)findViewById(R.id.layout1); // id 값 참조
        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);

        /* 터치 감지 함수 */
        layout1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int temp = 0;
                if(event.getAction() == MotionEvent.ACTION_DOWN){ // 스크린 눌렀다 땔때 카운트 증가
                    cnt++;
                    textView.setText("터치한 횟수 : " + String.valueOf(cnt));
                }
                return true;
            }
        });

        /* 닫기 함수 */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                return;
            }
        });
    }
}
