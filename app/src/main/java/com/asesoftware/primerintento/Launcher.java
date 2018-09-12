package com.asesoftware.primerintento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        ImageView door = findViewById(R.id.door);
        door.setVisibility(View.INVISIBLE);
    }

    protected void salludar(View v){
        ImageView door = findViewById(R.id.door);
        door.setVisibility(View.VISIBLE);
        Button boton = findViewById(R.id.btnSaludar);
        boton.setVisibility(View.INVISIBLE);
        Toast.makeText( getBaseContext(),R.string.toast_saludo,Toast.LENGTH_SHORT).show();
    }
    protected void salir(View v){
        AlertDialog.Builder confirmacion = new AlertDialog.Builder(this,R.style.st_alertas);
        confirmacion.setTitle("Espere ...");
        confirmacion.setMessage("¿Desea salir de la aplicación?");

        confirmacion.setPositiveButton("Salir", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                System.exit(0);
            }
        });
        confirmacion.setNegativeButton("Cancelar", null);
        confirmacion.show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getBaseContext(), R.string.toast_despedida,Toast.LENGTH_SHORT).show();
    }
}
