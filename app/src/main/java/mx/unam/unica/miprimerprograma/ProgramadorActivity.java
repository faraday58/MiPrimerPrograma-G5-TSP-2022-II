package mx.unam.unica.miprimerprograma;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class ProgramadorActivity extends AppCompatActivity {
    private String Display;
    private TextView txtvDisplayprog;
    private double result;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programador);
        txtvDisplayprog= findViewById(R.id.txtvDisplayprog);


        //Problema de object null
        if(savedInstanceState != null) {
            Display = savedInstanceState.getString("valorDisplayProg");
            txtvDisplayprog.setText(Display);
        }
    }

    public void onClickFunciones(View v)
    {
        switch (v.getId())
        {
            case R.id.btnSen:
                result= Math.sin(Double.valueOf(Display));
                break;
        }
        txtvDisplayprog.setText(String.valueOf(result));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

    }
/*
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Display = savedInstanceState.getString("valorDisplayProg");
        txtvDisplayprog.setText(Display);
    }*/
}
