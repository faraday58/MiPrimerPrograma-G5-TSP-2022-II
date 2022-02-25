package mx.unam.unica.miprimerprograma;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ProgramadorActivity extends AppCompatActivity {
    private TextView txtvDisplayprog;
    private Button btnSeno;
    String Display;
    //region Inicio de Aplicación
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programador);
        txtvDisplayprog= findViewById(R.id.txtvDisplayprog);
        btnSeno = findViewById(R.id.btnSeno);

        //intentVariables recuperamos todos los valores de una actividad anterior
        Intent  intentVariables = getIntent();
        //getStringExtra: Recupera el valor de la variable del Activity anterior
        Display = intentVariables.getStringExtra("valorDisplay");
        txtvDisplayprog.setText(Display);
        btnSeno.setOnClickListener(onClickSeno);

    }
    //endregion


    View.OnClickListener onClickSeno = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Seno();
        }
    };



    public void  Seno()
    {
        double resultado= Math.sin(Double.valueOf(Display) );
        Display = String.valueOf( resultado);
        txtvDisplayprog.setText(Display);
    }

}
