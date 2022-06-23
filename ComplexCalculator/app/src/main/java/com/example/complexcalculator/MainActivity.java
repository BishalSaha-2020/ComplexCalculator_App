package com.example.complexcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private TextView textView2;
    private TextView textView3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.editView1);
        editText2=findViewById(R.id.editView2);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                String s1=editText1.getText().toString();
                String s2=editText2.getText().toString();

                float c1=Float.parseFloat(s1);
                float c2=Float.parseFloat(s2);
                float Mag= (float) Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2));
                double Ang= Math.atan(c2/c1);
                double deg=Math.toDegrees(Ang);
                textView2.setText("The Magnitude of the given complex number is "+Mag);
                textView3.setText("The Angle of the given complex number is "+deg);
            }
        });


    }
    public void Rect(View v) {
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);


    }

}