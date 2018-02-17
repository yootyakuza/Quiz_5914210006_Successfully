package com.example.apple.quiz_5914210006;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2RegisterAddCode extends AppCompatActivity {

    EditText etAdd;
    Button btSave;

    private Manage manage;
    private Context con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_register_add_code);


        manage = new Manage(this);
        con = this;

        etAdd = (EditText)findViewById(R.id.editAddCode);
        btSave = (Button)findViewById(R.id.butSave);
        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = etAdd.getText().toString().trim();

                if(code.isEmpty()){
                    Toast t = Toast.makeText(con,"Please input Number!!",Toast.LENGTH_SHORT);
                    etAdd.requestFocus();
                    t.show();
                }
                else {

                    boolean isSuccess = manage.registerUser(code);

                    if(isSuccess){
                        Toast t = Toast.makeText(con,"Save " + etAdd.getText(),Toast.LENGTH_SHORT);
                        t.show();
                        finish();
                    }
                }
            }
        });
    }
}
