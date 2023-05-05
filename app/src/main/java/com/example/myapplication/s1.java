package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class s1 extends AppCompatActivity {

    Button btn1;
    EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s1);
        btn1=findViewById(R.id.btnsearch);
        search=findViewById(R.id.search);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String searchtxt=search.getText().toString();
                Intent intent = new Intent(getApplicationContext(),search.class);
                intent.putExtra("search",searchtxt);
                startActivity(intent);
                finish();



            }
        });
    }
}