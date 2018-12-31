package com.example.hongjs.aarlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.hongjs.aarlearnlibrary.UseAar;

public class MainActivity extends AppCompatActivity {
    private Button button = null ;
    private UseAar useAar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        useAar = new UseAar();

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,useAar.getTag(),Toast.LENGTH_LONG ).show();
            }
        }  );
    }
}
