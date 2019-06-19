package com.example.imcapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nom, pre;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom = (EditText)findViewById(R.id.editText);
        pre = (EditText)findViewById(R.id.editText2);
        btn = (Button)findViewById(R.id.Btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomsaisi = nom.getText().toString();
                String prenomsaisi = pre.getText().toString();
                Intent intent = new Intent(MainActivity.this, ScdActivity.class);
                intent.putExtra("NOM",nomsaisi);
                intent.putExtra("PRENOM",prenomsaisi);
                startActivity(intent);

            }
        });
   }


}