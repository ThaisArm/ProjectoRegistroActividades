package com.example.project4sw;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CambioContrasenaActivity extends AppCompatActivity {
    MainActivity login;
    Button btnGuardar, btnCancelar;
    EditText edtUsuario;
    EditText edtClaveActual;
    EditText edtClave1;
    EditText edtClave2;

    CambioContrasenaActivity(EditText edtUsuario, EditText edtClaveActual){
        this.edtClaveActual = edtClaveActual;
        this.edtUsuario = edtUsuario;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio_contrasena);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        edtUsuario = findViewById(edtUsuario.getId());
        edtClaveActual = findViewById(edtClaveActual.getId());
        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        btnCancelar = (Button) findViewById(R.id.btnCancelar);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CambioContrasenaActivity.this, PrincipalActivity.class));
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}