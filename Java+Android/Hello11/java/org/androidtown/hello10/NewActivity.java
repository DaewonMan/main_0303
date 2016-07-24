package org.androidtown.hello10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Button button = (Button)findViewById(R.id.button); // 객체 생성 및 id 찾기

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "돌아가기 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();

                finish(); // 화면에 보이는 액티비티를 없애준다.
            }
        });

    }
}
