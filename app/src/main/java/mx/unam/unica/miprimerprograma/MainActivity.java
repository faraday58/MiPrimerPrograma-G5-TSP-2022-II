package mx.unam.unica.miprimerprograma;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private   TextView txtvDisplay;    //Nombre del elemento a controlar
    private int contador;
    private String display;
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
        display=display +"1";
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
        startActivity(intentProgramador);

    }
}