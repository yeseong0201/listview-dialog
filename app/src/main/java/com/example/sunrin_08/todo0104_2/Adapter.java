package com.example.sunrin_08.todo0104_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    ArrayList<Content> al;

    Adapter(){
        al = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Object getItem(int position) {
        return al.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            Context context = parent.getContext();
        if(convertView ==null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.content_main,parent,false);
        }
        TextView name = convertView.findViewById(R.id.name);
        TextView num = convertView.findViewById(R.id.num);
        TextView birth= convertView.findViewById(R.id.birth);

        Content ct = (Content) getItem(position);
        name.setText(ct.getName());
        num.setText(ct.getNum());
        birth.setText(ct.getBirth());
        return convertView;


    }
    public void addItem(String name, String num, String birth){
        Content ct = new Content();
        ct.setName(name);
        ct.setNum(num);
        ct.setBirth(birth);

        al.add(ct);

    }

}
