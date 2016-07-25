package org.androidtown.hello10;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //String outName = data.getStringExtra("name");
        //Toast.makeText(getApplicationContext(), "전달받은 name 속성의 값 : " + outName, Toast.LENGTH_LONG).show();
        if(requestCode == User.REQ_CODE_PHONEBOOK) {
            if(resultCode == User.RES_CODE_SUCCESS) {
                String outName = data.getStringExtra("name");
                Toast.makeText(getApplicationContext(), "전달받은 name 속성의 값 : " + outName, Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(getApplicationContext(), "실패하였습니다.", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button); // 객체 생성 및 id 찾기
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01010001000"));
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User.loginName = "소녀시대";
                Intent myIntent = new Intent(getApplicationContext(), NewActivity.class);
                //startActivity(myIntent);
                myIntent.putExtra("loginName", User.loginName);
                startActivityForResult(myIntent, User.REQ_CODE_PHONEBOOK); // 두 번째 인자 값은 응답이 돌아 올 때 전달되는 구분 값
            }
        });
    }
}
