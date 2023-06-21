package com.example.uas_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button myButton;
    private Boolean isClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        myButton = findViewById(R.id.btn_click);
//        isClicked = false;
//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(isClicked) {
//                    myButton.setBackgroundColor(getResources().getColor(R.color.emas));
//                } else {
//                    myButton.setBackgroundColor(getResources().getColor(R.color.biru));
//                }
//                isClicked = !isClicked;
//            }
//        });
    }
}