package org.androidtown.study03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "닫기 버튼이 눌렸습니다.", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void onButton1Clicked(View v){
        Toast.makeText(this, "저장 버튼이 눌렸습니다.", Toast.LENGTH_LONG).show();
    }
}
