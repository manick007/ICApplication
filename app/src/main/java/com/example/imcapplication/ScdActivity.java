package com.example.imcapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ScdActivity extends AppCompatActivity {

    String leprenom, lenom;
    TextView textprenom, textnom,tail,poi,rst, inttension, intimc;
    Button btn,btt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scd);

        lenom = getIntent().getStringExtra("NOM");
        leprenom=getIntent().getStringExtra("PRENOM");
        textnom = (TextView)findViewById(R.id.textView3);
        textprenom = (TextView)findViewById(R.id.textView4);
        tail = (TextView)findViewById(R.id.taille);
        rst = (TextView)findViewById(R.id.textView6);
        poi = (TextView)findViewById(R.id.poi);
        inttension = (TextView)findViewById(R.id.textView11);
        intimc = (TextView)findViewById(R.id.textView5);
        btn = (Button)findViewById(R.id.button2);
        btt = (Button)findViewById(R.id.button3);

        textnom.setText("Votre Nom est: " + lenom);
        textprenom.setText("Votre prénom est: " + leprenom);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double lataille = Double.parseDouble(tail.getText().toString());
                Double lepoids = Double.parseDouble(poi.getText().toString());
                Double imc = lepoids/(lataille*lataille);
                rst.setText("Votre IMC est: " + imc.toString());
                if (imc < 16.5){
                    intimc.setText("Interprétation de l'IMC: Dénutrition");
                }else if((imc >= 16.5) && (imc < 18.5)){
                    intimc.setText("Interprétation de l'IMC: Maigreur");
                }else if((imc >= 18.5) && (imc < 25)){
                    intimc.setText("Interprétation de l'IMC: Corpulence normale");
                }else if((imc >= 25) && (imc < 30)){
                    intimc.setText("Interprétation de l'IMC: Surpoids");
                }else if((imc >= 30) && (imc < 35)){
                    intimc.setText("Interprétation de l'IMC: Obésité modérée");
                }else if((imc >= 35) && (imc < 40)){
                    intimc.setText("Interprétation de l'IMC: Obésité sévère");
                }else if(imc >= 40){
                    intimc.setText("Interprétation de l'IMC: Obésité Morbide");
                }else{
                    intimc.setText("Interpretation de l'IMC: Données intraitables");
                }

            }
        });
        btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inttension.setText("Cette fonctionalité n'est pas encore implémentée");
            }
        });

    }
}

