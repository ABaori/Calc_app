package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {



    public void button_1(View view){

        buttonTap("1");

    }public void button_2(View view){

        buttonTap("2");

    }public void button_3(View view){

        buttonTap("3");

    }public void button_4(View view){

        buttonTap("4");

    }public void button_5(View view){

        buttonTap("5");

    }public void button_6(View view){

        buttonTap("6");

    }public void button_7(View view){

        buttonTap("7");

    }public void button_8(View view){

        buttonTap("8");

    }public void button_9(View view){

        buttonTap("9");

    }public void button_equal(View view){
        EditText calc_bar = findViewById(R.id.editTextText);
        String calc_bar_str = String.valueOf(calc_bar.getText());
        TextView textView = findViewById(R.id.textView);
        textView.setText(calc_bar_str);
        if(calc_bar_str.contains("X")){
            calc_bar_str = calc_bar_str.replace("X" , "*");
        }if(calc_bar_str.contains("÷")){
            calc_bar_str = calc_bar_str.replace("÷", "/");
        }
        Expression expression = new ExpressionBuilder(calc_bar_str).build();


        double result = expression.evaluate();
        calc_bar.setText(String.format("%s",result));



    }public void button_div(View view){
        buttonTap("÷");


    }public void button_mult(View view){
        buttonTap("X");


    }public void button_add(View view){
        buttonTap("+");


    }
    public void button_subs(View view){
        buttonTap("-");


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText calc_bar = findViewById(R.id.editTextText);
        String calc_bar_str = String.valueOf(calc_bar.getText());
    }
    public void buttonTap(String str){
        EditText calc_bar = findViewById(R.id.editTextText);
        String calc_bar_str = String.valueOf(calc_bar.getText());

        if(calc_bar_str.equals("0")){
            calc_bar.setText(str);
        }else{
            calc_bar.setText(String.format("%s%s",calc_bar_str,str));
        }


    }

    public void button_back(View view) {
        EditText calc_bar = findViewById(R.id.editTextText);
        String calc_bar_str = String.valueOf(calc_bar.getText());
        calc_bar.setSelection(calc_bar_str.length());
        button_clear(view);
        buttonTap(calc_bar_str.substring(0,calc_bar_str.length()-1));



    }

    public void button_left_brack(View view) {
        buttonTap(")");
    }

    public void button_right_brack(View view) {
        buttonTap("(");
    }

    public void button_clear(View view) {
        EditText calc_bar = findViewById(R.id.editTextText);
        TextView textView = findViewById(R.id.textView);
        calc_bar.setText("0");
        textView.setText("0");
    }

    public void button_0(View view) {
        buttonTap("0");
    }

    public void button_dot(View view) {
        buttonTap(".");
    }
}