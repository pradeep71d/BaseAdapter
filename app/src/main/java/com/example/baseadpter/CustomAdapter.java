package com.example.baseadpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String countrylist[];
    int flag[];
    LayoutInflater inflater;

    public CustomAdapter(Context context, String[] countrylist, int[] flag) {
        this.context = context;
        this.countrylist = countrylist;
        this.flag = flag;
       inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return countrylist.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.items, null);
        TextView textView = view.findViewById(R.id.t1);
        ImageView imageView = view.findViewById(R.id.i1);
        textView.setText(countrylist[position]);
        imageView.setImageResource(flag[position]);
        return view;
    }
}
