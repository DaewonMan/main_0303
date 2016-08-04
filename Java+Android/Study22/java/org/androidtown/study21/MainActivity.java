package org.androidtown.study21;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;

    ListView listView;
    SongItemView aiView;

    String songName;
    String groupName;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { // 다른 화면에서의 정보 가져오는 함수
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1) {
            if(resultCode == 200) {
                //String outName = data.getStringExtra("name");
                //Toast.makeText(getApplicationContext(), "전달받은 name 속성의 값 : " + outName, Toast.LENGTH_LONG).show();
                songName = data.getStringExtra("song");
                groupName = data.getStringExtra("group");

                Toast.makeText(getApplicationContext(), "전달한 아이템 : " + songName + ", " + groupName, Toast.LENGTH_LONG).show();

                aiView.appendName(songName, groupName);
                listView.setAdapter(aiView.adapterDeclare());
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

        listView = (ListView)findViewById(R.id.listView);
        aiView = new SongItemView(this);
        listView.setAdapter(aiView.adapterDeclare());




        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {  // 닫기 버튼 동작함수
            @Override
            public void onClick(View v) {
                System.exit(1); // 종료
            }
        });

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() { // 추가 버튼 동작 함수
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), SongInfoActivity.class);
                //startActivity(myIntent); // 다른 화면으로 이동
                startActivityForResult(myIntent, 1);
            }
        });
    }
}
