package org.androidtown.mycalculator;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by DaewonMan on 2016-07-29.
 */
public class FriendCalculator extends CalculatorObject {
    Context mContext;

    public FriendCalculator(Context context) {
        mContext = context;
    }

    public int add(int a, int b) {
        Toast.makeText(mContext, "더하기를 했습니다.", Toast.LENGTH_LONG).show();

        return a + b;
    }
}
