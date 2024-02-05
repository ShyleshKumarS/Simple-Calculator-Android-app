package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView tvans;
    Button btadd,btsub,btmul,btdiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tvans=findViewById(R.id.tvans);
        btadd=findViewById(R.id.btadd);
        btsub=findViewById(R.id.btsub);
        btmul=findViewById(R.id.btmul);
        btdiv=findViewById(R.id.btdiv);

        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1,val2,ans;
                val1=Integer.parseInt(et1.getText().toString());
                val2=Integer.parseInt(et2.getText().toString());
                ans=val1+val2;
                tvans.setText(String.valueOf(ans));
            }
        });

        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1,val2,ans;
                val1=Integer.parseInt(et1.getText().toString());
                val2=Integer.parseInt(et2.getText().toString());
                ans=val1-val2;
                tvans.setText(String.valueOf(ans));
            }
        });

        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1,val2,ans;
                val1=Integer.parseInt(et1.getText().toString());
                val2=Integer.parseInt(et2.getText().toString());
                ans=val1*val2;
                tvans.setText(String.valueOf(ans));
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double val1,val2,ans;
                val1=Integer.parseInt(et1.getText().toString());
                val2=Integer.parseInt(et2.getText().toString());
                if(val2==0) {
                    tvans.setText("Division by zero is not possible");
                    return;
                }
                ans=val1/val2;
                tvans.setText(String.valueOf(ans));
            }
        });

    }
}