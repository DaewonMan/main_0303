package org.androidtown.study19;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by DaewonMan on 2016-07-31.
 */
public class BMW implements Car{
    Context context;

    public BMW() {

    }
    public BMW(Context mContext) {
        context = mContext;
    }
    @Override
    public void doRun() {
        Toast.makeText(context, "BMW의 doRun 메서드가 호출되었습니다.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void doStart() {
        Toast.makeText(context, "BMW의 doStart 메서드가 호출되었습니다.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void doTurn() {
        Toast.makeText(context, "BMW의 doturn 메서드가 호출되었습니다.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void doStop() {
        Toast.makeText(context, "BMW의 doStop 메서드가 호출되었습니다.", Toast.LENGTH_LONG).show();
    }
}
