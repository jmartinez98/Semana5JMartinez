package com.example.semana5jmartinez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText user, correo;
    Bundle usuario;
    RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7;
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        user = findViewById(R.id.etUser);
        correo = findViewById(R.id.etEmail);
        rb1 = findViewById(R.id.rbFamilia);
        rb2 = findViewById(R.id.rbAmigos);
        rb3 = findViewById(R.id.rbSolo);
        rb4 = findViewById(R.id.rbEuropa);
        rb5 = findViewById(R.id.rbNorte);
        rb6 = findViewById(R.id.rbSur);
        rb7 = findViewById(R.id.rbAsia);
        cb1 = findViewById(R.id.cbVisita);
        cb2 = findViewById(R.id.cbTrabajo);
        cb3 = findViewById(R.id.cbOtro);
        cb4 = findViewById(R.id.cbTelefono);
        cb5 = findViewById(R.id.cbAplicacion);
        cb6 = findViewById(R.id.cbSitio);


        usuario = getIntent().getExtras();
        String datoUsuario = usuario.getString("usuarioEnviado");
        user.setText(datoUsuario);


    }

    public void Aceptar(View v){
        Intent intentAcep = new Intent(Main2Activity.this, Main3Activity.class);

        //PREGUNTA 1
        if(rb1.isChecked()==true){
            intentAcep.putExtra("rb1Enviado", rb1.getText().toString());
        } else {
            if(rb2.isChecked()==true) {
                intentAcep.putExtra("rb2Enviado", rb2.getText().toString());
            } else {
                if(rb3.isChecked()==true){
                    intentAcep.putExtra("rb3Enviado", rb3.getText().toString());
                }
            }
        }

        //PREGUNTA 2
        if(rb4.isChecked()==true){
            intentAcep.putExtra("rb4Enviado", rb4.getText().toString());
        } else {
            if(rb5.isChecked()==true) {
                intentAcep.putExtra("rb5Enviado", rb5.getText().toString());
            } else {
                if(rb6.isChecked()==true){
                    intentAcep.putExtra("rb6Enviado", rb6.getText().toString());
                } else {
                    if(rb7.isChecked()==true){
                        intentAcep.putExtra("rb7Enviado", rb7.getText().toString());
                    }
                }
            }
        }

        //PREGUNTA 3
        if(cb1.isChecked()==true){
            intentAcep.putExtra("cb1Enviado", cb1.getText().toString());
        }
        if(cb2.isChecked()==true){
            intentAcep.putExtra("cb2Enviado", cb2.getText().toString());
        }
        if(cb3.isChecked()==true){
            intentAcep.putExtra("cb3Enviado", cb3.getText().toString());
        }

        //PREGUNTA 4
        if(cb4.isChecked()==true){
            intentAcep.putExtra("cb4Enviado", cb4.getText().toString());
        }
        if(cb5.isChecked()==true){
            intentAcep.putExtra("cb5Enviado", cb5.getText().toString());
        }
        if(cb6.isChecked()==true){
            intentAcep.putExtra("cb6Enviado", cb6.getText().toString());
        }

        //PREGUNTA 5
        intentAcep.putExtra("emailEnviado", correo.getText().toString());

        startActivity(intentAcep);
    }

}
