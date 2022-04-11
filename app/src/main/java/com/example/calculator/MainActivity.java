package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private  Button buttonAdd, buttonClean, buttonMyltiply, buttonDivide, buttonSubtract;
    private  TextView operation, result;
    private  EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonClean = (Button) findViewById(R.id.buttonClean);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonMyltiply = (Button) findViewById(R.id.buttonMyltiply);
        buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        operation = (TextView) findViewById(R.id.operation);
        result = (TextView) findViewById(R.id.result);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);

        buttonSubtract.setOnClickListener(this);
        buttonMyltiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonClean.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        float num1 = 0;
        float num2 = 0;
        float res = 0;

        num1 = Float.parseFloat(number1.getText().toString());
        num2 = Float.parseFloat(number1.getText().toString());

        switch (v.getId()) {
            case R.id.buttonAdd:
                operation.setText("+")
                res = num1 + num2;
                break;

            case R.id.buttonAdd:
                operation.setText("-")
                res = num1 - num2;
                break;

            case  R.id.buttonAdd:
                operation.setText("*")
                res = num1*num2;
                break;

            case  R.id.buttonAdd:
                operation.setText("/")
                res = num1/num2;
                break;
            default:
                break;
        }
    }
}