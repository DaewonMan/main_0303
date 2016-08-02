package org.androidtown.mylist;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by DaewonMan on 2016-08-01.
 */
public class SingerLayout extends LinearLayout {
    Context mContext;

    TextView textView;
    TextView textView2;
    ImageView imageView;

    private void init() {
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.singer_item, this, true);

        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);

        imageView = (ImageView)findViewById(R.id.imageView);
    }

    public SingerLayout(Context context) {
        super(context);

        mContext = context;
        init();
    }

    public SingerLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        mContext = context;
        init();
    }

    public void setNameText(String name) {
        textView.setText(name);
    }

    public void setAgeText(String age) {
        textView2.setText(age);
    }

    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }
}
