package com.example.missonimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView, imageView2;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scrollView);
        scrollView.setHorizontalScrollBarEnabled(true);

        scrollView = findViewById(R.id.scrollView2);
        scrollView.setHorizontalScrollBarEnabled(true);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.test);

        int bitmapwidth = bitmap.getIntrinsicWidth();
        int bitmapheight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapheight;
        imageView.getLayoutParams().height = bitmapheight;

        imageView2.setImageDrawable(bitmap);
        imageView2.getLayoutParams().width = bitmapwidth;
        imageView2.getLayoutParams().height = bitmapheight;

        imageView2.setVisibility(View.INVISIBLE); //처음에는 밑에 안보이게게
    }
    public void onClickup(View v){
        changeImageUp();
    }
    public void onClickdown(View v){
        changeImageDown();
    }

    public void changeImageUp(){
        imageView2.setVisibility(View.INVISIBLE);
        imageView.setVisibility(View.VISIBLE);
    }

    public void changeImageDown() {
        imageView.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.VISIBLE);
    }
}