package com.example.darek.projekt1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;

                if(counter%4 == 0){
                    Intent intent1 = new Intent(getApplicationContext(), SecondActivity.class);
                    intent1.putExtra("string1", "Dupa!");
                    startActivity(intent1);
                }

                if(counter%2 == 0){
                    EditText text1 = (EditText) findViewById(R.id.text_1);
                    text1.setVisibility(View.INVISIBLE);
                } else {
                    EditText text1 = (EditText) findViewById(R.id.text_1);
                    text1.setVisibility(View.VISIBLE);
                }


                Toast.makeText(getApplicationContext(), "aaa", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();

        Toast.makeText(getApplicationContext(), "I'm back", Toast.LENGTH_SHORT).show();


    }

}
