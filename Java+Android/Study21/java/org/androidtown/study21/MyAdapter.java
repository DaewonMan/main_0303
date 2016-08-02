package org.androidtown.study21;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by DaewonMan on 2016-08-01.
 */
public class MyAdapter extends BaseAdapter {
    Context mContext;
    SongItem item = new SongItem();
    //public String[] names = {"씨스타", "현아", "다비치","걸스데이", "인피니트"};

    public MyAdapter() {

    }

    public MyAdapter(Context context) {
        mContext = context;
    }
    @Override
    public int getCount() {
        return item.names.length;
    }

    @Override
    public Object getItem(int position) {
        return item.names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        item = new SongItem(mContext);

        return item.layoutDeclare(position);
    }
}
