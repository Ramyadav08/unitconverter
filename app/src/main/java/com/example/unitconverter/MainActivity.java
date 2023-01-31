package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView tv2;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        tv2=findViewById(R.id.tv2);
        et=findViewById(R.id.et);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hy Clicked lister Worked!", Toast.LENGTH_SHORT).show();
                String s=et.getText().toString();
                int kg=Integer.parseInt(s);
                double pound=2.205 * kg;
                tv2.setText("the corresponding value of the kg in pound is :"+ pound);

            }
        });



    }
}