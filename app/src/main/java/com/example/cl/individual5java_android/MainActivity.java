package com.example.cl.individual5java_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners() {

        Button showToast = findViewById(R.id.buttonShowToast);
        Button counter = findViewById(R.id.buttonCounter);
        TextView textView = findViewById(R.id.textView);
        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "hello toast", Toast.LENGTH_SHORT).show();
            }
        });
    }
}