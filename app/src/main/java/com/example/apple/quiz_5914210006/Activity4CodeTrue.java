package com.example.apple.quiz_5914210006;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4CodeTrue extends AppCompatActivity {

    Button btGoHome1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4_code_true);
        btGoHome1 = (Button)findViewById(R.id.butGoHome1);

        btGoHome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });
    }
}
