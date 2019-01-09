package com.example.oriin_bsqgiqy.edittext;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn1;
EditText et1;
TextView tv1;
String s1 = new String();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.et1);
        tv1=(TextView) findViewById(R.id.tv1);
        btn1=(Button) findViewById(R.id.btn1);

    }

    public void go(View view) {
        s1=et1.getText().toString();
        tv1.setText(s1);
        tv1.setBackgroundColor(Color.BLUE);
        tv1.setEms(8);
        tv1.setTextColor(Color.RED);

    }

}
