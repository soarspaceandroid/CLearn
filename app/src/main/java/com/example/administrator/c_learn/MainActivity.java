package com.example.administrator.c_learn;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    static{
        System.loadLibrary("soarLib");
    }

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageview);
        getDataLocal(0);
    }


    private native String getDataLocal(int type);

    private native void setDataLocal(List<String> list);
}
