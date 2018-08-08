package com.example.zhang.puzzleapplication.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

public class GridPicListAdapter extends BaseAdapter {
 
    // 映射List
    private List<Bitmap> picList;
    private Context context;
 
    public GridPicListAdapter(Context context, List<Bitmap> picList) {
        this.context = context;
	this.picList = picList;
    }
 
    @Override
    public int getCount() {
	return picList.size();
    }
 
    @Override
    public Object getItem(int position) {
	return picList.get(position);
    }
 
    @Override
    public long getItemId(int position) {
	return position;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup arg2) {
	ImageView iv_pic_item = null;
	if (convertView == null) {
	    iv_pic_item = new ImageView(context);
	    // 设置布局 图片
	    iv_pic_item.setLayoutParams(new GridView.LayoutParams(80, 100));
	    // 设置显示比例类型
	    iv_pic_item.setScaleType(ImageView.ScaleType.FIT_XY);
	} else {
	    iv_pic_item = (ImageView) convertView;
	}
	iv_pic_item.setBackgroundColor(Color.BLACK);
	iv_pic_item.setImageBitmap(picList.get(position));
	return iv_pic_item;
    }
}