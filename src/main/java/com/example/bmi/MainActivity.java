package com.example.bmi;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView result;
    private EditText insertheight, insertweight;
   private Button compute;
   private float a, b, c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        result = findViewById(R.id.result);
        insertheight = findViewById(R.id.insertheight);
        insertweight = findViewById(R.id.insertweight);
        compute = findViewById(R.id.compute);
        compute.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
           case R.id.compute:
                a = Float.parseFloat(insertheight.getText().toString());
                b = Float.parseFloat(insertweight.getText().toString());
               c = b / ((a / 100) * (a / 100));
               result.setText("" +c);
               if(c<=18.5)
               {
                   Toast.makeText(MainActivity.this,"Under Weight", Toast.LENGTH_LONG).show();
               }
               else if(c>18.5 && c<=24.9)
               {
                   Toast.makeText(MainActivity.this,"Normal Weight", Toast.LENGTH_LONG).show();
               }
               else if(c>24.9 && c<=29.9)
               {
                   Toast.makeText(MainActivity.this,"Over Weight", Toast.LENGTH_LONG).show();
               }
               else if(c<=30)
               {

                   Toast.makeText(MainActivity.this,"Obesity", Toast.LENGTH_LONG).show();
               }








    }
    }


}
