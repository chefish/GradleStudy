package com.fish.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s = BuildConfig.API_URL;
         tv = (TextView) findViewById(R.id.aa);
        tv.setText(s);

        ScreenUtil.GetInfo(this);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x=10;
                x++;
            }
        });
    }
}
