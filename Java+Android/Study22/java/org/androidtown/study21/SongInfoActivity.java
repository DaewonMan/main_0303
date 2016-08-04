package org.androidtown.study21;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SongInfoActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    Button button3;
    Button button4;

    String songName;
    String groupName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_info);

        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);

        button3.setOnClickListener(new View.OnClickListener() { // 저장 버튼 동작 함수
            @Override
            public void onClick(View v) {
                songName = editText.getText().toString(); // 음악명과 가수명을 입력 받는다.
                groupName = editText2.getText().toString();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() { // 닫기 버튼 동작 함수
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.putExtra("song", songName);
                intent.putExtra("group", groupName);
                setResult(200, intent);

                finish(); // 원래 화면으로 돌아간다.
            }
        });
    }
}
