package com.example.napstyle.a222sqliteejemplo1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Napstyle on 27/02/2018.
 */

public class UsuarioSQLiteHelper extends SQLiteOpenHelper {

    String sql="CREATE TABLE Alumno(Num_Control INTEGER,Nombre TEXT,Apellido TEXT)";
    String insert="INSERT INTO Alumno(Num_Control,Nombre,Apellido) VALUES(13400381,'Nomar','Aranda')," +
            "(13400382,'Jairo','Gonzales')," +
                "(13400383,'Cesar','Ramses')" +
            "(13400384,'Nidia','Contreras')" +
            "(13400385,'Kevin','Mendez')";

    public UsuarioSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){

        super(context,name,factory,version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);
        db.execSQL(insert);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS Alumno");
        db.execSQL(sql);
    }
}
