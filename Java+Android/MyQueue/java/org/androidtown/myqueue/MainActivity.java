package org.androidtown.myqueue;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.ConcurrentLinkedQueue;


public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    EditText editText;

    ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);

        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                queue.offer(count);
                editText.setText("\n큐에 추가함 :" + count);

                count++;

                editText.append("\n큐 : " + queue);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int outValue = queue.poll();

                editText.setText("\n큐에서 가져옴 : " + outValue);

                editText.append("\n큐 : " + queue);
            }
        });

    }
}
