package com.example.minicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText first;
    private EditText second;
    private Button addButton;
    private Button defButton;
    private Button divButton;
    private Button mltpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        addButton = findViewById(R.id.add_button);
        defButton = findViewById(R.id.def_button);
        divButton = findViewById(R.id.div_button);
        mltpButton = findViewById(R.id.mltp_button);

        addButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(first.getText().toString());
                float num2 = Float.parseFloat(second.getText().toString());
                float sum = num1 + num2;
                textView.setText(String.valueOf(sum));
            }
        });
        defButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(first.getText().toString());
                float num2 = Float.parseFloat(second.getText().toString());
                float def = num1 - num2;
                textView.setText(String.valueOf(def));
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(first.getText().toString());
                float num2 = Float.parseFloat(second.getText().toString());
                float div = (num1 / num2)+(num1 % num2) ;
                textView.setText(String.valueOf(div));
            }
        });
        mltpButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(first.getText().toString());
                float num2 = Float.parseFloat(second.getText().toString());
                float mltp = num1 * num2;
                textView.setText(String.valueOf(mltp));
            }
        });
    }


}