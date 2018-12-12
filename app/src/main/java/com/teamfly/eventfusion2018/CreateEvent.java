package com.teamfly.eventfusion2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateEvent extends AppCompatActivity {

    TextView text1, text2, text3, text4, text5, text6, text7, text8;
    EditText edit1, edit2, edit3, edit4, edit5, edit6, edit7;
    Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);
        text7 = findViewById(R.id.text7);
        text8 = findViewById(R.id.text8);

        edit1 = findViewById(R.id.edit1);
        edit2 =  findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);
        edit4 =  findViewById(R.id.edit4);
        edit5 = findViewById(R.id.edit5);
        edit6 =  findViewById(R.id.edit6);
        edit7 = findViewById(R.id.edit7);

        button3 = findViewById(R.id.button3);
    }
}
