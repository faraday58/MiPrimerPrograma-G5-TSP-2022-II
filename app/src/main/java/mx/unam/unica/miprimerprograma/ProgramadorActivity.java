package mx.unam.unica.miprimerprograma;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
        txtvDisplayprog= findViewById(R.id.txtvDisplay);


        //Problema de object null
        if(savedInstanceState != null) {
            Display = savedInstanceState.getString("valorDisplay");
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
}
