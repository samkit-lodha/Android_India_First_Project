package com.example.androidindiafirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long countClicks=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null){
            countClicks=savedInstanceState.getLong("countClicks");
            TextView textViewCount=findViewById(R.id.countText);
            String countString=String.format("%d",countClicks);
            textViewCount.setText(countString);
        }
    }

    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putLong("countClicks",countClicks);
    }

    public void toastClicked(View view){
        Toast toastMessage=Toast.makeText(this,R.string.toastMessage,Toast.LENGTH_SHORT);
        toastMessage.show();
    }

    public void zeroClicked(View view){
        countClicks=0;
        TextView textViewCount=findViewById(R.id.countText);
        textViewCount.setText("0");
    }

    public void countClicked(View view){
        countClicks++;
        TextView textViewCount=findViewById(R.id.countText);
        String countString=String.format("%d",countClicks);
        textViewCount.setText(countString);
    }
}