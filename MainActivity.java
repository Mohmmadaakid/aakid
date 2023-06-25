package com.example.calmsleeptaska;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.StackView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private StackView stackView;
    private StackAdapter stackAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stackView = findViewById(R.id.stack_view);
        stackAdapter = new StackAdapter(this);
        stackView.setAdapter(stackAdapter);

        // Add images to the stack adapter
        stackAdapter.addImage(R.drawable.numbone);
        stackAdapter.addImage(R.drawable.numbtwo);
        stackAdapter.addImage(R.drawable.numbthree);
        stackAdapter.addImage(R.drawable.numfour);
        stackAdapter.addImage(R.drawable.sleepf);
    }
}