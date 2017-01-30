package com.uninorte.firstapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void GetMinGrade(View view) {
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);

        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);
        EditText Txb1 = (EditText) findViewById(R.id.Grade1);
        EditText Txb2 = (EditText) findViewById(R.id.Grade2);
        EditText Txb3 = (EditText) findViewById(R.id.Grade3);
        if (Txb1.getText().toString().isEmpty() || Txb2.getText().toString().isEmpty() || Txb3.getText().toString().isEmpty())
        {
            Toast.makeText(this, "Ningun campo de nota puede estar vacio", Toast.LENGTH_LONG).show();
            TextView Mytext = (TextView) findViewById(R.id.LastGrade);
            Mytext.setText("");
        }
        else
        {
            Float Gr1 = Float.parseFloat(Txb1.getText().toString());
            Float Gr2 = Float.parseFloat(Txb2.getText().toString());
            Float Gr3 = Float.parseFloat(Txb3.getText().toString());
            if (Gr1 > 5 || Gr2 > 5 || Gr3 > 5) {
                Toast.makeText(this, "Ningun nota puede ser mayor de 5", Toast.LENGTH_LONG).show();
                TextView Mytext = (TextView) findViewById(R.id.LastGrade);
                Mytext.setText("");
                return;
            }
            float Gr4 = (3.5f * 4f) - Gr1 - Gr2 - Gr3;
            TextView Mytext = (TextView) findViewById(R.id.LastGrade);

            if (Gr4 <= 0) {
                Mytext.setText("Felicidades,no necesitas nota");

            } else if (Gr4 <= 5) {
                Mytext.setText("Necesitas una nota de: " + Float.toString(Gr4));

            } else

            {
                Mytext.setText("No hay nada que puedas hacer");

            }


        }





    }
}
