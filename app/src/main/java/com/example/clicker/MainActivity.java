package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private Integer counter = 0;

    @SuppressLint("SetTextI18n")
    public void OnClickBtnAddSocialCredit(View view){
        counter ++;
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText("+" + counter.toString());
    }
}
