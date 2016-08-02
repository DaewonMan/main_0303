package org.androidtown.study21;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);
        SongItemView aiView = new SongItemView(this);
        listView.setAdapter(aiView.adapterDeclare());

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {  // 닫기 버튼 동작함수
            @Override
            public void onClick(View v) {
                System.exit(1); // 종료
            }
        });
    }
}
