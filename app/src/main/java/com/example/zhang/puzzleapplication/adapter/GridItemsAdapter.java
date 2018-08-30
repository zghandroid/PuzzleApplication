package com.example.zhang.puzzleapplication.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by 12345 on 2018/7/17.
 */

public class GridItemsAdapter extends BaseAdapter {
    private List<Bitmap> data;
    private Context context;
    private int type;

    public GridItemsAdapter(List<Bitmap> data, Context context,int type) {
        this.data = data;
        this.context = context;
        this.type = type;
    }

    @Override
    public int getCount() {
        return data!=null?data.size():0;
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView=null;
        if(convertView==null){

            imageView = new ImageView(context);

            imageView.setLayoutParams(new GridView.LayoutParams(parent.getWidth()/type-5, parent.getHeight()/type));
            // 设置显示比例类型
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }else {
            imageView = (ImageView) convertView;
        }
        imageView.setBackgroundColor(Color.BLACK);
        imageView.setImageBitmap(data.get(position));
        return imageView;
    }
}
