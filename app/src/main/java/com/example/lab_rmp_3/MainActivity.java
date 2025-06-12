package com.example.lab_rmp_3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // По умолчанию запускается чат с LinearLayout
        setContentView(R.layout.activity_main_linear);
    }
}
