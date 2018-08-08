package com.example.zhang.puzzleapplication.bean;

import android.graphics.Bitmap;

public class ItemBean {
 
    // Item的Id
    private int itemId;
    // bitmap的Id
    private int bitmapId;
    // bitmap
    private Bitmap bitmap;
 
    public int getItemId() {
        return itemId;
    }
 
    public void setItemId(int itemId) {
	this.itemId = itemId;
    }
 
    public ItemBean() {
    }
 
    public int getBitmapId() {
	return bitmapId;
    }
 
    public void setBitmapId(int bitmapId) {
	this.bitmapId = bitmapId;
    }
 
    public Bitmap getBitmap() {
	return bitmap;
    }
 
    public void setBitmap(Bitmap bitmap) {
	this.bitmap = bitmap;
    }
 
    public ItemBean(int itemId, int bitmapId, Bitmap bitmap) {
	this.itemId = itemId;
	this.bitmapId = bitmapId;
	this.bitmap = bitmap;
    }
 
}
