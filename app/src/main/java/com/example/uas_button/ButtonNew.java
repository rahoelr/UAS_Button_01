package com.example.uas_button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

public class ButtonNew extends AppCompatButton {
    boolean isClicked = false;
    private int textCol = ContextCompat.getColor(getContext(), R.color.white);

    public ButtonNew(@NonNull Context context) {
        super(context);
        init();
    }

    public ButtonNew(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ButtonNew(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        setBackgroundColor(ContextCompat.getColor(getContext(), R.color.emas));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClicked){
                    setBackgroundColor(ContextCompat.getColor(getContext(), R.color.emas));
                } else {
                    setBackgroundColor(ContextCompat.getColor(getContext(), R.color.biru));
                }
                isClicked = !isClicked;
            }
        });
        setTextColor(textCol);
        setTextSize(12f);
        setGravity(Gravity.CENTER);
    }

}

