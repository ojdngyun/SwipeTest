package com.mycompany.swipetest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private ImageView mImageView;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.imageView);
        mTextView = (TextView)findViewById(R.id.text);
        Log.v("TAG", "hi");

//        mImageView.setOnTouchListener(new OnSwipeTouchListener() {
//
//            @Override
//            public boolean onSwipeTop() {
//                Toast.makeText(MainActivity.this, "top", Toast.LENGTH_SHORT).show();
//                return true;
//            }
//            @Override
//            public boolean onSwipeRight() {
//                Toast.makeText(MainActivity.this, "right", Toast.LENGTH_SHORT).show();
//                return true;
//            }
//            @Override
//            public boolean onSwipeLeft() {
//                Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();
//                return true;
//            }
//            @Override
//            public boolean onSwipeBottom() {
//                Toast.makeText(MainActivity.this, "bottom", Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });
        mImageView.setOnTouchListener(new OnSwipeTouchListener(this) {
            @Override
            public void onSwipeLeft() {
//                Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();
                mTextView.setText("left");
                // Whatever
            }

            @Override
            public void onSwipeRight() {
//                Toast.makeText(MainActivity.this, "right", Toast.LENGTH_SHORT).show();
                mTextView.setText("right");
            }

            @Override
            public void onSwipeTop() {
//                Toast.makeText(MainActivity.this, "top", Toast.LENGTH_SHORT).show();
                mTextView.setText("top");
            }

            @Override
            public void onSwipeBottom() {
//                Toast.makeText(MainActivity.this, "bottom", Toast.LENGTH_SHORT).show();
                mTextView.setText("bottom");
            }

            @Override
            public void onFastSwipeBottom() {
//                Toast.makeText(MainActivity.this, "fast bottom", Toast.LENGTH_SHORT).show();
                mTextView.setText("fast bottom");
            }

            @Override
            public void onFastSwipeLeft() {
//                Toast.makeText(MainActivity.this, "fast left", Toast.LENGTH_SHORT).show();
                mTextView.setText("fast left");
            }

            @Override
            public void onFastSwipeRight() {
//                Toast.makeText(MainActivity.this, "fast right", Toast.LENGTH_SHORT).show();
                mTextView.setText("fast right");
            }

            @Override
            public void onFastSwipeTop() {
//                Toast.makeText(MainActivity.this, "fast top", Toast.LENGTH_SHORT).show();
                mTextView.setText("fast top");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
