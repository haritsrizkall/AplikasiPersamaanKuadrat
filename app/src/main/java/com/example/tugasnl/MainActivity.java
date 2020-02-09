package com.example.tugasnl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    Button btnFaktorkan;
    TextView x1Res,x2Res,determinanRes;
    EditText inputA,inputB,inputC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Aplikasi Faktor Kuadrat");

        btnFaktorkan = findViewById(R.id.btnFaktorkan);
        inputA = findViewById(R.id.inputA);
        inputB = findViewById(R.id.inputB);
        inputC = findViewById(R.id.inputC);
        x1Res = findViewById(R.id.x1Res);
        x2Res = findViewById(R.id.x2Res);
        determinanRes = findViewById(R.id.determinanRes);

        determinanRes.setVisibility(View.GONE);
        x1Res.setVisibility(View.GONE);
        x2Res.setVisibility(View.GONE);


        btnFaktorkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a,b,c,d,x1,x2;
                a = Double.valueOf(inputA.getText().toString());
                b = Double.valueOf(inputB.getText().toString());
                c = Double.valueOf(inputC.getText().toString());

                d = Math.pow(b,2)-(4*a*c);

                x1 = (-b + Math.sqrt(d))/2*a;
                x2 = (-b - Math.sqrt(d))/2*a;

                if(d<0){
                    String result1 = getString(R.string.tidakAkar);
                    String result2 = "  ";
                    String determinan = "Determinan  :"+ d;
                    determinanRes.setText(determinan);
                    determinanRes.setVisibility(View.VISIBLE);
                    x1Res.setText(result1);
                    x1Res.setVisibility(View.VISIBLE);
                    x2Res.setText(result2);
                    x2Res.setVisibility(View.VISIBLE);
                }else if(d>0){
                    String result1 = getString(R.string.x1)+ ":  " + x1;
                    String result2 = getString(R.string.x2)+ ":  " + x2;
                    String determinan = "Determinan  :"+ d;
                    determinanRes.setText(determinan);
                    determinanRes.setVisibility(View.VISIBLE);
                    x1Res.setText(result1);
                    x2Res.setText(result2);
                    x1Res.setVisibility(View.VISIBLE);
                    x2Res.setVisibility(View.VISIBLE);
                }else {
                    String result1 = "Akar "+":  "+ x1;
                    String result2 = "  ";
                    String determinan = "Determinan  :"+ d;
                    determinanRes.setText(determinan);
                    determinanRes.setVisibility(View.VISIBLE);
                    x1Res.setText(result1);
                    x2Res.setText(result2);
                    x1Res.setVisibility(View.VISIBLE);
                    x2Res.setVisibility(View.VISIBLE);

                }

            }
        });



    }
}
