package mx.unam.unica.miprimerprograma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private   TextView txtvDisplay;    //Nombre del elemento a controlar
    private int contador;
    private String display;
    boolean punto = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvDisplay = findViewById(R.id.txtvDisplay);
        display="1";
    }

    public void onClickContar(View v)
    {
        txtvDisplay.setText(String.valueOf(contador));
        Contar();
    }

    public  void onClickNumero(View v)
    {
        switch (v.getId()   )
        {
            case R.id.btnUno:
                display=display +"1";
                break;
            case R.id.btnDos:
                display+= getResources().getString(R.string.btnStringDos);
                break;
            /*case R.id.punto:
                if( !punto)
                {
                    display += ".";
                }else

                punto = false;
              */
            /*case R.id.btnDos:
                if ( display.contains(".")   )
                {

                }
            */
        }

        txtvDisplay.setText(display);
    }

    public void Contar()
    {
        contador++;
    }

    public void onClickProgramador(View vista)
    {
        Intent intentProgramador = new Intent(MainActivity.this,ProgramadorActivity.class );
        intentProgramador.putExtra("valorDisplay",display);
        Log.d("Salida","Display: " +display );
        startActivity(intentProgramador);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("valorHV",display);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        display = savedInstanceState.getString("valorHV");
        txtvDisplay.setText(display);
    }
}