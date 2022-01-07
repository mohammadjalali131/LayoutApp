package com.example.profileapp;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class CostomFontTextView extends AppCompatTextView  {
    public CostomFontTextView(@NonNull Context context) {
        super(context);
        if (!isInEditMode()) {
            setupTextView();
        }

    }

    public CostomFontTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            setupTextView();
        }
    }

    public CostomFontTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            setupTextView();
        }
    }

    private void setupTextView(){
         MyApp myApp= (MyApp) getContext().getApplicationContext();
         setTypeface(myApp.getIranianSansFont());

    }

}
