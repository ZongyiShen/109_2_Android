package com.example.android.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String content=getIntent().getStringExtra("count");
        TextView count=(TextView)findViewById(R.id.count_2);
        count.setText(content);
    }
    public void ButtonBack(View view){
        Intent intent=new Intent();
        TextView count=(TextView)findViewById(R.id.count_2);
        intent.putExtra("count2",count.getText().toString());
        intent.setClass(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }

}