package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private int mCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    public void countUp(View view){
        ++mCount;
        if(button1!=null)
            button1.setText(Integer.toString(mCount));
    }
    public void nextScreen(View view ){
        Intent intent =new Intent(MainActivity.this,Activity2.class);
        startActivity(intent);
    }

}