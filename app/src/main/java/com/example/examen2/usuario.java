package com.example.examen2;

import android.content.Context;

public class usuario {
    bd base=null;
    private String nombre="";
    private String apellidoP="";
    private String apellidoM="";
    private String email="";
    private String password="";
    private int    edad=0;
    private float  peso=0;
    private String fechaNaci="";
    private String celular="";
    private String cel_emergencia="";
    private String domicilio="";
    private String rfc="";
    private String sangre="";
    private String curp="";
    private String postal="";
    private String sexo="";
    private String estado_civil="";
    private String estado_fisico="";
    private String hospital="";
    private String municipio="";
    String regreso="";

    public usuario(Context c)
    {
        base= new bd(c,"agenda",null,2);
    }

    public String insertar(String nombre,String apellidoP,String apellidoM,
                           String email,String password,int edad,float peso,
                           String fechaNa,String celular,String cel_emergencia,
                           String domicilio, String rfc,String sangre, String curp,
                           String postal,String sexo, String estado_civil,String estado_fisico,String hospital, String municipio)
    {
        this.nombre=nombre;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
        this.email=email;
        this.password=password;
        this.edad=edad;
        this.peso=peso;
        this.fechaNaci=fechaNa;
        this.celular=celular;
        this.cel_emergencia=cel_emergencia;
        this.domicilio=domicilio;
        this.rfc=rfc;
        this.sangre=sangre;
        this.curp=curp;
        this.postal=postal;
        this.sexo=sexo;
        this.estado_civil=estado_civil;
        this.estado_fisico=estado_fisico;
        this.hospital=hospital;
        this.municipio=municipio;

        regreso=base.insertar(this.nombre,this.apellidoP,this.apellidoM,this.email,
                this.password,this.edad,this.peso,this.fechaNaci,this.celular,
                this.cel_emergencia,this.domicilio,this.rfc,this.sangre,this.curp,
                this.postal,this.sexo,this.estado_civil,this.estado_fisico,this.hospital,this.municipio);

        return regreso;

    }
}

