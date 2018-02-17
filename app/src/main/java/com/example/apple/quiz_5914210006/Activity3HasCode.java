package com.example.apple.quiz_5914210006;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

public class Activity3HasCode extends AppCompatActivity {

    NumberPicker np1,np2,np3;
    Button btOK;
    private Manage manage;
    private Context con;
    public int num1 = 0,num2 = 0,num3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_has_code);

        manage = new Manage(this);
        con = this;

        np1 = (NumberPicker)findViewById(R.id.numberPicker1);
        np2 = (NumberPicker)findViewById(R.id.numberPicker2);
        np3 = (NumberPicker)findViewById(R.id.numberPicker3);
        btOK = (Button)findViewById(R.id.butOk);

        final String[] data = {"0","1","2","3","4","5","6","7","8","9"};
        final String[] data2 = {"0","1","2","3","4","5","6","7","8","9"};
        final String[] data3 = {"0","1","2","3","4","5","6","7","8","9"};


        np1.setMaxValue(9);
        np1.setMinValue(0);
        np1.setWrapSelectorWheel(true);


        np2.setMaxValue(9);
        np2.setMinValue(0);
        np2.setWrapSelectorWheel(true);


        np3.setMaxValue(9);
        np3.setMinValue(0);
        np3.setWrapSelectorWheel(true);

        np1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                num1 = np1.getValue();
            }
        });
        np2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                num2 = np2.getValue();
            }
        });
        np3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                num3 = np3.getValue();
            }
        });
        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = Integer.toString(num1);
                String n2 = Integer.toString(num2);
                String n3 = Integer.toString(num3);
                String code = n1 + n2 + n3;
                //String code = User.getText().toString().trim();//รอแก้โดยได้จากการรวมจากข้อมูลทั้ง สามของ numberpicker


                    boolean isSuccess = manage.checkLoginValidate(code);

                    if(isSuccess){
                        Intent intent = new Intent(getApplicationContext(),Activity4CodeTrue.class);
                        Toast t = Toast.makeText(con,"Congratulations,You have discovered the treasure.",Toast.LENGTH_SHORT);
                        t.show();
                        startActivity(intent);
                    }
                    else
                    {
                        Intent intent = new Intent(getApplicationContext(),Activity5CodeFalse.class);
                        Toast t = Toast.makeText(con,"You are a thief.Catch it !!!", Toast.LENGTH_SHORT);
                        t.show();
                        startActivity(intent);
                    }
                }
        });
    }

}
