package com.example.complexcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class MainActivity2 extends AppCompatActivity {

    private EditText editText5;
    private EditText editText6;
    private TextView textView5;
    private TextView textView6;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText5=findViewById(R.id.editText5);
        editText6=findViewById(R.id.editText6);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        button3=findViewById(R.id.button3); 

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                String s1= editText5.getText().toString();
                String s2= editText6.getText().toString();
                float c1=Float.parseFloat (s1);
                float c2=Float.parseFloat(s2);
                double c3=Math.toRadians(c2);



                double x= (double) (c1*(cos(c3)));
                double y= (double) (c1*(sin(c3)));
                textView5.setText("X = "+x);
                textView6.setText("Y = "+y);

            }
        });
    }
    public void back(View v) {
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}