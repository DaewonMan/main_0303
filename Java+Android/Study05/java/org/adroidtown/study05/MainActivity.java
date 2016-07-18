package org.adroidtown.study05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    EditText editText3;

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0); // 프로그램 종료
            }
        });

    }

    public void onButton1Clicked(View v) {
        String str01 = editText.getText().toString();
        String str02 = editText2.getText().toString();
        String str03 = editText3.getText().toString();
        String concat = str01 + ", " + str02 + ", " + str03;

        Toast.makeText(this, "입력된 값 : " + concat, Toast.LENGTH_LONG).show();
    }
}
