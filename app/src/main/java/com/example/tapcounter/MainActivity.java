package com.example.tapcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button counter_button,reset_button;
    TextView counter_textView;

    private static final String TAG = "MainActivity";
    private int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate:in");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter_button = (Button)findViewById(R.id.counterButton);
        reset_button = (Button)findViewById(R.id.resetButton);
        counter_textView = (TextView)findViewById(R.id.countText);

        counter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = count+1;
                counter_textView.setText(Integer.toString(count));
            }
        });

        reset_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                counter_textView.setText(Integer.toString(count));
            }
        });
    }
}