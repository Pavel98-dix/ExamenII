package com.example.examen2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class registros extends AppCompatActivity {
    EditText etnombre,etApellidoP, etApellidoM,etEmail,etEdad,etCelular,
            etFechaN,etSexo,etDomicilio,etcurp,etPostal,etSangre,etEstadoCivil,etRfc,
            etEstadoFisico,etPassword,etPeso,etHospital,etMunicipio,etCelEmergencia;
    Button  btnGuardar;
    usuario metodos=new usuario(this);
    String usuario="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros);

        etnombre=(EditText)findViewById(R.id.etNombre);
        etApellidoP=(EditText)findViewById(R.id.etApellidoP);
        etApellidoM=(EditText)findViewById(R.id.etApellidoM);
        etCelular=(EditText)findViewById(R.id.etCelular);
        etFechaN=(EditText)findViewById(R.id.etFechaNaci);
        etSexo=(EditText)findViewById(R.id.etSexo);
        etDomicilio=(EditText)findViewById(R.id.etDomicilio);
        etcurp=(EditText)findViewById(R.id.etCurp);
        etPostal=(EditText)findViewById(R.id.etPostal);
        etSangre=(EditText)findViewById(R.id.etSangre);
        etEstadoCivil=(EditText)findViewById(R.id.etEstado_civil);
        etRfc=(EditText)findViewById(R.id.etRfc);
         etEstadoFisico=(EditText)findViewById(R.id.etEstado_fisico);
        etPeso=(EditText)findViewById(R.id.etPeso);
        etHospital=(EditText)findViewById(R.id.etHospital);
        etEmail=(EditText)findViewById(R.id.etEmail);
        etEdad=(EditText)findViewById(R.id.etEdad);
        etMunicipio=(EditText)findViewById(R.id.etMunicipio);
        etPassword=(EditText)findViewById(R.id.etPassword);
        etCelEmergencia=(EditText)findViewById(R.id.etCelEmergencia);

        btnGuardar=(Button) findViewById(R.id.btnGuardar);




        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrar();
            }
        });
    }

    private void registrar()
    {
         String nombre=etnombre.getText().toString();
         String apellidoP=etApellidoP.getText().toString();
         String apellidoM=etApellidoM.getText().toString();
         String email=etEmail.getText().toString();
         String password=etPassword.getText().toString();
         int    edad=Integer.parseInt(etEdad.getText().toString());
         float  peso=Float.parseFloat(etPeso.getText().toString());
         String fechaNaci=etFechaN.getText().toString();
         String celular=etCelular.getText().toString();
         String cel_emergencia=etCelEmergencia.getText().toString();
         String domicilio=etDomicilio.getText().toString();
         String rfc=etRfc.getText().toString();
         String sangre=etSangre.getText().toString();
         String curp=etcurp.getText().toString();
         String postal=etPostal.getText().toString();
         String sexo=etSexo.getText().toString();
         String estado_civil=etEstadoCivil.getText().toString();
         String estado_fisico=etEstadoFisico.getText().toString();
         String hospital=etHospital.getText().toString();
         String municipio=etMunicipio.getText().toString();
         usuario=metodos.insertar(nombre,apellidoP,apellidoM,email,password,
                 edad,peso,fechaNaci,celular,cel_emergencia,domicilio,rfc,
                 sangre,curp,postal,sexo,estado_civil,estado_fisico,hospital,municipio);
        Toast.makeText(getApplicationContext(),usuario,Toast.LENGTH_LONG).show();

    }



}