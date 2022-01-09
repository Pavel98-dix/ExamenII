package com.example.examen2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class bd extends SQLiteOpenHelper {
    SQLiteDatabase sql1,sql2,sql3;
    String regreso="";
    diccionario dic=new diccionario();
    public bd(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(dic.getCreate_table());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(dic.getBorrarTabla());
        onCreate(db);
    }

    public String insertar(String nombre,String apellidoP,String apellidoM,
                           String email,String password,int edad,float peso,
                           String fechaNa,String celular,String cel_emergencia,
                           String domicilio, String rfc,String sangre, String curp,
                           String postal,String sexo, String estado_civil,String estado_fisico,String hospital, String municipio)
    {
        sql1=getWritableDatabase();
        ContentValues valore= new ContentValues();
        String datos[]=dic.getDatos();
        valore.put(datos[1],nombre);
        valore.put(datos[2],apellidoP);
        valore.put(datos[3],apellidoM);
        valore.put(datos[4],email);
        valore.put(datos[5],password);
        valore.put(datos[6],edad);
        valore.put(datos[7],peso);
        valore.put(datos[8],fechaNa);
        valore.put(datos[9],celular);
        valore.put(datos[10],cel_emergencia);
        valore.put(datos[11],domicilio);
        valore.put(datos[12],rfc);
        valore.put(datos[13],sangre);
        valore.put(datos[14],curp);
        valore.put(datos[15],postal);
        valore.put(datos[16],sexo);
        valore.put(datos[17],estado_civil);
        valore.put(datos[18],estado_fisico);
        valore.put(datos[19],hospital);
        valore.put(datos[20],municipio);

        long insertar =sql1.insert(dic.getTabla(),null,valore);
        return condicion((int) insertar );
    }
    public String condicion (int i)
    {
        if (i>0)
        {
            regreso="Operacion Exitosa";
        }
        else
        {
            regreso ="Fallo";
        }
        return regreso;
    }
}
