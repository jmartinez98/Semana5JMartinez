package com.example.semana5jmartinez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView txt1, txt2, txt3, txt4, txt5;
    Bundle correo, rb1, rb2, rb3, rb4, rb5, rb6, rb7, cb1, cb2, cb3, cb4, cb5, cb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt1 = findViewById(R.id.txtR1);
        txt2 = findViewById(R.id.txtR2);
        txt3 = findViewById(R.id.txtR3);
        txt4 = findViewById(R.id.txtR4);
        txt5 = findViewById(R.id.txtR5);

        //PREGUNTA 1
        rb1 = getIntent().getExtras();
        String datoRb1 = rb1.getString("rb1Enviado");
        txt1.setText(datoRb1);

        rb2 = getIntent().getExtras();
        String datoRb2 = rb2.getString("rb2Enviado");
        txt1.setText(datoRb2);

        rb3 = getIntent().getExtras();
        String datoRb3 = rb3.getString("rb3Enviado");
        txt1.setText(datoRb3);

        //PREGUNTA 2
        rb4 = getIntent().getExtras();
        String datoRb4 = rb4.getString("rb4Enviado");
        txt2.setText(datoRb4);

        rb5 = getIntent().getExtras();
        String datoRb5 = rb5.getString("rb5Enviado");
        txt2.setText(datoRb5);

        rb6 = getIntent().getExtras();
        String datoRb6 = rb6.getString("rb6Enviado");
        txt2.setText(datoRb6);

        rb7 = getIntent().getExtras();
        String datoRb7 = rb7.getString("rb7Enviado");
        txt2.setText(datoRb7);

        //PREGUNTA 3
        cb1 = getIntent().getExtras();
        String datoCb1 = cb1.getString("cb1Enviado");
        txt3.setText(datoCb1);

        cb2 = getIntent().getExtras();
        String datoCb2 = cb2.getString("cb2Enviado");
        txt3.setText(datoCb2);

        cb3 = getIntent().getExtras();
        String datoCb3 = cb3.getString("cb3Enviado");
        txt3.setText(datoCb3);

        //PREGUNTA 4
        cb4 = getIntent().getExtras();
        String datoCb4 = cb4.getString("cb4Enviado");
        txt4.setText(datoCb4);

        //PREGUNTA 5
        cb5 = getIntent().getExtras();
        String datoCb5 = cb5.getString("cb5Enviado");
        txt4.setText(datoCb5);








        correo = getIntent().getExtras();
        String datoEmail = correo.getString("emailEnviado");
        txt5.setText(datoEmail);


    }
}
