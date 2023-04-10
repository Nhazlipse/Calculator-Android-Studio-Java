package com.example.calculatorapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView workingsTV;
    TextView resultsTV;

    String workings = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();
    }

    private void initTextViews() {
        workingsTV = (TextView) findViewById(R.id.workingsTextView);
        resultsTV = (TextView) findViewById(R.id.resultTextView);
    }

    private void setWorkingsTV(String givenValue) {
        workings = workings + givenValue;
        resultsTV.setText(workings);
    }

    public void hasilOnClick(View view)
    {
        public void hasilOnClick(View view) {
        try {
            // Evaluate the expression using Android's built-in math evaluator
            String result = new ExpressionBuilder(workings).build().evaluate().toString();
            // Display the result in the resultsTV TextView
            resultsTV.setText(result);
        } catch (Exception e) {
            // If there is an error evaluating the expression, display an error message
            Toast.makeText(this, "Invalid expression", Toast.LENGTH_SHORT).show();
        }
    }

    public void clearOnClick(View view) {
        workingsTV.setText("");
        workings = "";
        resultsTV.setText("");
    }

    public void bracketsOnClick(View view) {
    }

    public void powerofOnClick(View view) {
        setWorkingsTV("@");
    }

    public void bagiOnClick(View view) {
        setWorkingsTV("/");
    }

    public void tujuhOnClick(View view) {
        setWorkingsTV("7");
    }

    public void delapanOnClick(View view) {
        setWorkingsTV("8");
    }

    public void sembilanOnClick(View view) {
        setWorkingsTV("9");
    }

    public void empatOnClick(View view) {
        setWorkingsTV("4");
    }

    public void limaOnClick(View view) {
        setWorkingsTV("5");
    }

    public void enamOnClick(View view) {
        setWorkingsTV("6");
    }

    public void kurangOnClick(View view) {
        setWorkingsTV("-");
    }

    public void satuOnClick(View view) {
        setWorkingsTV("1");
    }

    public void duaOnClick(View view) {
        setWorkingsTV("2");
    }

    public void tigaOnClick(View view) {
        setWorkingsTV("3");
    }

    public void tambahOnClick(View view) {
        setWorkingsTV("+");
    }

    public void titikOnClick(View view) {
        setWorkingsTV(".");
    }

    public void nolOnClick(View view) {
        setWorkingsTV("0");
    }

    public void kaliOnClick(View view) {
        setWorkingsTV("x");
    }
}