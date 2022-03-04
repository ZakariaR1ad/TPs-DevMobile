package com.example.tp0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MonActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button_ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast toast = Toast.makeText(MonActivity.this,"OctaC0re goes brrr",Toast.LENGTH_LONG);
                //toast.show();
                Intent intent = new Intent(MonActivity.this,OctaC0re.class);
                MonActivity.this.startActivity(intent);

            }
        });
    }
}