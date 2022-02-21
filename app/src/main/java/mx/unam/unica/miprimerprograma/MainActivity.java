package mx.unam.unica.miprimerprograma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private   TextView txtvDisplay;    //Nombre del elemento a controlar
    private int contador;
    private String display="1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  txtvDisplay = findViewById(R.id.txtvDisplay);Error muy común confundir el nombre de los recursos
        txtvDisplay= findViewById(R.id.txtvDisplay);
       /* if( savedInstanceState != null  )
        {
            display=savedInstanceState.getString("valorDisplay");
            txtvDisplay.setText(display);
        }*/

    }

    public void onClickContar(View v)
    {
        txtvDisplay.setText(String.valueOf(contador));
        Contar();
    }

    public  void onClickNumero(View v)
    {
        switch (v.getId()  )
        {
            case R.id.btnUno:
                display=display +"1";
                break;
            case R.id.btnDos:
                display+="2";
                break;
            case R.id.btnClear:
                display="0";
                break;
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
        intentProgramador.putExtra("valorDisplayProg",display);
        startActivity(intentProgramador);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("valorDisplay",display);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        display=savedInstanceState.getString("valorDisplay");
        txtvDisplay.setText(display);
    }
}