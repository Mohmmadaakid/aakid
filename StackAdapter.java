package com.example.calmsleeptaska;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
public class StackAdapter extends BaseAdapter {

    private Context context;
    private List<Integer> imageList;

    public StackAdapter(Context context) {
        this.context = context;
        imageList = new ArrayList<>();
    }

    public void addImage(int resId) {
        imageList.add(resId);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public Object getItem(int position) {
        return imageList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(imageList.get(position));
        return imageView;
    }
}