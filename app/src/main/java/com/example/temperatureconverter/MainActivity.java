package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    TextView res;
    Button cel,far;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.degree);
        res=findViewById(R.id.ans);
        cel=findViewById(R.id.cel);
        far=findViewById(R.id.far);
        cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float convert;
                float ans;
                convert=Float.parseFloat(et1.getText().toString());
                ans=((convert-32)*5)/9;
                res.setText("Fahrenheit to Celsius: "+ans);
            }
        });
        far.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                float convert;
                float ans;
                convert=Float.parseFloat(et1.getText().toString());
                ans=((convert*9)/5)+32;
                res.setText("Celsius to Fahrenheit: "+ans);
            }
        });

    }
}