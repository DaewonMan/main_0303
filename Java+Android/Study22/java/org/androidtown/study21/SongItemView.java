package org.androidtown.study21;

import android.content.Context;

/**
 * Created by DaewonMan on 2016-08-01.
 */
public class SongItemView {
    Context mContext;
    MyAdapter adapter = new MyAdapter();

    public SongItemView(Context context) {
        mContext = context;
    }
    public MyAdapter adapterDeclare() {
        adapter = new MyAdapter(mContext);

        return  adapter;
    }
    public void appendName(String song, String group ) { // 배열에 노래명과 가수명 할당
        adapter.appendName(song, group);
    }
}
