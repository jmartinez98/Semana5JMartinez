package com.example.semana5jmartinez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario, clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.etUsuario);
        clave = findViewById(R.id.etClave);
    }

    public void Ingresar(View v){
        Intent intentIng = new Intent(MainActivity.this, Main2Activity.class);
        String user = usuario.getText().toString();
        String pass = clave.getText().toString();

        if(user.equals("juan_martinez") && pass.equals("est.uisrael.2019")){
            intentIng.putExtra("usuarioEnviado", usuario.getText().toString());
            startActivity(intentIng);
            Toast.makeText(getApplicationContext(), "Bienvenido usuario", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Usuario o clave incorrecta", Toast.LENGTH_LONG).show();
        }

    }
}
