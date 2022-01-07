package com.example.profileapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Picture;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageButton btn_back;
    Button edit_profile;
    EditText edittext_firstname;
    EditText edittext_lasttname;
    CheckBox java_checkbox;
    CheckBox android_checkbox;
    CheckBox php_checkbox;
    CheckBox laravel_checkbox;
    RadioButton female_redio;
    RadioButton male_redio;
    Button save_form;

    private Typeface typeface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeface = Typeface.createFromAsset(getAssets(), "fonts/iranian_sans.ttf");

        edit_profile = findViewById(R.id.edit_profile);
        edit_profile.setTypeface(typeface);

        save_form = findViewById(R.id.save_form);
        save_form.setTypeface(typeface);




        edit_profile = findViewById(R.id.edit_profile);
        edit_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "عکس پروفایل تغییر کرد", Toast.LENGTH_SHORT).show();
            }
        });

        save_form = findViewById(R.id.save_form);
        save_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "اطلاعات شما ذخیره شد", Toast.LENGTH_SHORT).show();
            }
        });


        edittext_firstname = findViewById(R.id.edittext_firstname);
        edittext_firstname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        edittext_lasttname = findViewById(R.id.edittext_lasttname);
        edittext_lasttname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        java_checkbox = findViewById(R.id.java_checkbox);
        java_checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean ischecked) {

                Toast.makeText(MainActivity.this, String.valueOf(ischecked), Toast.LENGTH_SHORT).show();
            }

        });

        android_checkbox = findViewById(R.id.android_checkbox);
        android_checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }

        });

        php_checkbox = findViewById(R.id.php_checkbox);
        php_checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        laravel_checkbox = findViewById(R.id.laravel_checkbox);
        laravel_checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });


        female_redio = findViewById(R.id.female_redio);
        female_redio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        male_redio = findViewById(R.id.male_redio);
        male_redio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });

        setupToolbar();


    }

    private void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }

        });

        for (int i = 0; i < toolbar.getChildCount(); i++) {
            if(toolbar.getChildAt(i) instanceof TextView);
            ((TextView) toolbar.getChildAt(i)).setTypeface(typeface);

        }
        
    }

}