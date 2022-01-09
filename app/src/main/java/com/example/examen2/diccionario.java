package com.example.examen2;

public class diccionario {
    private String create_table="CREATE TABLE usuarios (id INTEGER  PRIMARY KEY AUTOINCREMENT, " +
            "nombre TEXT," +
            "apellidoP TEXT," +
            "apellidoM Text," +
            "email TEXT, " +
            "password TEXT," +
            "edad INTEGER, "+
            "peso REAL, " +
            "fechaNaci TEXT," +
            "celular TEXT," +
            "cel_emergencia TEXT," +
            "domicilio TEXT," +
            "rfc TEXT," +
            "sangre TEXT," +
            "curp TEXT," +
            "postal TEXT," +
            "sexo TEXT," +
            "estado_civil TEXT," +
            "estado_fisico TEXT,"+
            "hospital TEXT," +
            "municipio TEXT" +
            ")";
    private String tabla="usuarios";
    private String borrarTabla="DROP TABLE IF EXISTS usuarios";
    private String datos[]={"id","nombre","apellidoP","apellidoM","email",
            "password","edad","peso","fechaNaci","celular","cel_emergencia",
            "domicilio","rfc","sangre","curp","postal","sexo","estado_civil","estado_fisico","hospital","municipio"};
    private String clausulaWhere1="id=?";

    public String getClausulaWhere2() {
        return clausulaWhere2;
    }

    public void setClausulaWhere2(String clausulaWhere2) {
        this.clausulaWhere2 = clausulaWhere2;
    }

    private String clausulaWhere2="email=? and password=?";
    public String getCreate_table() {
        return create_table;
    }

    public void setCreate_table(String create_table) {
        this.create_table = create_table;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getBorrarTabla() {
        return borrarTabla;
    }

    public void setBorrarTabla(String borrarTabla) {
        this.borrarTabla = borrarTabla;
    }

    public String[] getDatos() {
        return datos;
    }

    public void setDatos(String[] datos) {
        this.datos = datos;
    }

    public String getClausulaWhere1() {
        return clausulaWhere1;
    }

    public void setClausulaWhere1(String clausulaWhere1) {
        this.clausulaWhere1 = clausulaWhere1;
    }




}
