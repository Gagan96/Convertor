package com.iam9091107.escoladeltreball.org.convertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etEuros;
    private EditText etDollar;
    private Button convertbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEuros = (EditText)findViewById(R.id.dollarinput);
        etDollar = (EditText)findViewById(R.id.euroinput);
        convertbtn = (Button)findViewById(R.id.convertbtn);

        convertbtn.setOnClickListener(view -> doConversion());

    }

    private void doConversion() {
        if (etEuros.getText().toString()!=null) {


            double euros = Double.parseDouble(etEuros.getText().toString());
            double dollars = euros * 1.17;
            etDollar.setText(String.valueOf(dollars));
        }else {

        }

        }
}
