package mx.unam.unica.miprimerprograma;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ProgramadorActivity extends AppCompatActivity {
    private TextView txtvDisplayprog;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programador);
        txtvDisplayprog= findViewById(R.id.txtvDisplay);
        String Display =savedInstanceState.getString("valorDisplay");

        txtvDisplayprog.setText(Display);


    }
}
