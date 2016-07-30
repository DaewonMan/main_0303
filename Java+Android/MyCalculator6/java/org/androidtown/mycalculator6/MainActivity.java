package org.androidtown.mycalculator6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Calculator {
        public int add(int a, int b) {
            Toast.makeText(getApplicationContext(), "더하기를 했습니다.", Toast.LENGTH_LONG).show();
            return a + b;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator calc = new Calculator();
        int result = calc.add(10, 10);

    }
}
