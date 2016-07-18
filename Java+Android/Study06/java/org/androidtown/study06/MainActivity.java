package org.androidtown.study06;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText; // 객체 선언
    EditText editText2;
    EditText editText3;
    Button button2;
    TextView textView;
    TextView textView2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText); // 해당 id에 참조
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
        button2 = (Button)findViewById(R.id.button2);
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);

        /* 닫기 버튼 동작 함수 */
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0); //프로그램 종료
            }
        });

    }
    /* 저장 버튼 동작 함수 */
    public void onButton1Clicked(View v) {
        String str01 = editText.getText().toString(); // 사용자로 부터 입력 값 할당
        String str02 = editText2.getText().toString();
        String str03 = editText3.getText().toString();
        String concat = str01 + ", " + str02 + ", " + str03; // 입력 값 합치기

        textView.setText("입력된 이름:" + str01); // 하단 텍스트 뷰에 출력
        textView2.setText("입력된 나이:" + str02);
        textView3.setText("입력된 주소:" + str03);

        Toast.makeText(this, "입력된 값 : " + concat, Toast.LENGTH_LONG).show(); // 입력 값 토스트로 출력
    }
}
