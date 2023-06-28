package com.example.lab3task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button inc;


    int counter; TextView show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc=(Button)findViewById(R.id.b1);
        show=(TextView)findViewById(R.id.tv1); counter=0;
        inc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                counter++;
                show.setText("count is "+counter);
            }
        });
    }
}

